//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
     /*
     //Opgave 1

    Student student1 = new Student("Anna", 19);
    Student student2 = new Student("Sofie", 17);
    Student student3 = new Student("Marie", 18);

    Student[] students = new Student[3];
    students[0] =  new Student("Anna", 19);
    students[1] = new Student("Sofie", 17);
    students[2] = new Student("Marie", 18);

    for(Student student : students){
        student.printInfo();
    }

    Student oldest = students[0];
    for (Student student : students){
        if(student.age > oldest.age) {
            oldest = student;
        }
    }
    System.out.println("The oldest is: ");
    oldest.printInfo();


      */
    // Opagve 2
    /*

    Product product1 = new Product("Laptop", 8999, new String[]{"New", "Electronics"});
    Product product2= new Product("Hoover", 1499, new String[]{"Sale", "Home appliances"});
    Product product3 = new Product("Hair dryer", 900, new String[]{"Sale", "Beauty"});
    Product product4 = new Product("Rice cooker",500, new String[]{"New", "Kitchen"});

    Product[] products = {product1, product2, product3,product4};
    for (Product product : products) {
        if (product.hasTags("Sale")) {
            System.out.println("Products with sale tag: " + product.name);
        }
    }

        Product mostExpensive = products[0];
        for(Product p: products){
            if (p.price > mostExpensive.price){
                mostExpensive = p;
                System.out.println();
            }
        }
        System.out.println("The most expensive product is: " + mostExpensive.name);

     */

    // Opgave 3
    /*

    BankAccount account = new BankAccount("Hanin", 2000);

    account.deposit(700);
    account.deposit(650);
    account.deposit(1000);
    account.withdraw(500);
    account.withdraw(425);
    account.deposit(240);

    account.printTransactionHistory();
    System.out.println("Current balance: " + account.getBalance());

     */



















    }










