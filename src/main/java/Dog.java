/** 
* @author Varshini
* @version 17.0.1
*/

class Dog {
    private String name;
    private String breed;
    private int weight;
    /**
     * Instance Variables ^^^
     * @param name - name of dog
     * @param breed - dog's breed
     * @param weight - dog's weight
     */
    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }
    /**
     * @return returns name of dog
     */
    public String getName() {
        return name;
    }
    /**
     * @return returns breed of dog
     */
    public String getBreed() {
        return breed;
    }
    /**
     * @return returns weight of dog
     */
    public int getWeight() {
        return weight;
    }
    /** 
     * Updates dog's name
     * @param name - new name of dog
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Updates dog's breed
     * @param breed - new breed of dog
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
    /**
     * Updates dog's weight
     * @param weight - new weight of dog
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

}