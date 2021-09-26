package Trees;

public class Trees {
    protected String brandType = "This tree";

}

class newTree extends Trees {
    private String TreeType = "grows apples";

    public static void main(String[] args) {
        newTree AppleTree = new newTree();



        System.out.println(AppleTree.brandType + " " + AppleTree.TreeType);
    }
}

class newTree2 extends Trees {
    private String TreeType = "grows oranges";

    public static void main(String[] args) {
        newTree2 orangeTree = new newTree2();



        System.out.println(orangeTree.brandType + " " + orangeTree.TreeType);
    }
}
