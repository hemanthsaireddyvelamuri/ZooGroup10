package edu.nwmissouri.zoo10group;

/**
 *
 * @author Hemanth Sai Reddy Velamuri
 */
public class Member extends Visitor {

    /**
     * Gives the count of animals visited
     */
    protected int animalsVisited = 0;

    /**
     * Member interface so that gives details about the entrance fee, discount
     * and size of the group
     */
    public Member() {
        this.entranceFee = 50;
        this.discount = 10;
        this.groupSize = 1;

        try {
            int a[] = new int[4];
            System.out.println("Access element three :" + a[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } finally {
            System.out.println("Out of the block");
        }
    }

    /**
     * Each click on an animal increments the person visiting a animal
     */
    public void visitAnimal() {
        this.animalsVisited += 1;
    }

    /**
     * Gets the animal visited
     *
     * @return
     */
    public int getAnimalsVisited() {
        return animalsVisited;
    }
}
