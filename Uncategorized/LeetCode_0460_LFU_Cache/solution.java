import java.util.HashMap;
import java.util.Map;

class LFUCache {

    private static class Node {
        int key;
        int value;
        int freq;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1;
        }
    }

    private static class DoublyLinkedList {
        Node head;
        Node tail;
        int size;

        DoublyLinkedList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        void addNode(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
            size++;
        }

        void removeNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        Node removeTail() {
            if (size > 0) {
                Node lruNode = tail.prev;
                removeNode(lruNode);
                return lruNode;
            }
            return null;
        }
    }

    private final int capacity;
    private int minFreq;
    private final Map<Integer, Node> keyNodeMap;
    private final Map<Integer, DoublyLinkedList> freqListMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        this.keyNodeMap = new HashMap<>();
        this.freqListMap = new HashMap<>();
    }

    public int get(int key) {
        Node node = keyNodeMap.get(key);
        if (node == null) {
            return -1;
        }
        updateFreq(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (keyNodeMap.containsKey(key)) {
            Node node = keyNodeMap.get(key);
            node.value = value;
            updateFreq(node);
        } else {
            if (keyNodeMap.size() == capacity) {
                DoublyLinkedList minList = freqListMap.get(minFreq);
                Node evicted = minList.removeTail();
                keyNodeMap.remove(evicted.key);
            }

            Node newNode = new Node(key, value);
            keyNodeMap.put(key, newNode);
            minFreq = 1;

            DoublyLinkedList list = freqListMap.computeIfAbsent(1, k -> new DoublyLinkedList());
            list.addNode(newNode);
        }
    }

    private void updateFreq(Node node) {
        int currentFreq = node.freq;
        DoublyLinkedList curList = freqListMap.get(currentFreq);
        curList.removeNode(node);

        if (currentFreq == minFreq && curList.size == 0) {
            minFreq++;
        }

        node.freq++;
        DoublyLinkedList newList = freqListMap.computeIfAbsent(node.freq, k -> new DoublyLinkedList());
        newList.addNode(node);
    }
}