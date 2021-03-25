public class BSTGenrator {

    public BST createBST(){
        Car car;
        RandomCarObjectGenerator randCar = new RandomCarObjectGenerator();
        BST tree = new BST();
        for(int i = 0; i< 30; i++){
            car = randCar.randomCar();
            System.out.println(car);
            tree.insert(car);
        }
        return tree;
    }
}
