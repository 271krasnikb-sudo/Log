public class LearningLinks {
    public static void main(String[] args) {
        Node one = new Node<>(20);
        Node two = new Node<>(30);
        Node three = new Node<>(1);
    

        // Linking the nodes
        one.setLink(two);
        two.setLink(three);

        System.out.println(one);
        System.out.println(one.getNext());
        System.out.println(one.getNext().getNext());

       

        Node temp = one;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setLink(new Node<>(-5));

         temp = one;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }

        Node newNode = new Node<>(4);
        newNode.setLink(one);

        temp = newNode;

        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        temp.setLink(null);
    }
}
