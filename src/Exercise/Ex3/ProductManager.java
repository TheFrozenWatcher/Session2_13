package Exercise.Ex3;

import java.util.*;

public class ProductManager {
    private List<Product> productList;

//    public ProductManagement() {
//        this.productList = new ArrayList<>();
//    }

    public ProductManager(){
        this.productList=new LinkedList<>();
    }
    public void displayProduct(Product product) {
        System.out.println("Id: " + product.getProductId() + "; Name: " + product.getProductName() + "; Price: " + product.getPrice());

    }

    public void showAll() {
        if (productList.size() == 0) {
            System.out.println("Danh sách rỗng");
            return;
        }
        for (Product product : productList) {
            System.out.println("Id: " + product.getProductId() + "; Name: " + product.getProductName() + "; Price: " + product.getPrice());
        }
    }

    //    Lấy vị trí theo id
    public int getProductIndexById(String id) {
        int ind = -1;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId().equals(id)) {
                ind = i;
            }
        }
        return ind;
    }

    //    Tìm sinh viên theo id
    public Product findProductById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        String id = sc.nextLine();
        for (Product product : productList) {
            if (product.getProductId() == id) {
                System.out.println("Hiển thị thông tin sản phẩm:");
                displayProduct(product);
                return product;
            }
        }
        System.out.println("Không tìm thấy sản phẩm!");
        return null;
    }

    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        String id = sc.nextLine();
        if (getProductIndexById(id) != -1) {
            System.out.println("Id không hợp lệ!");
            return;
        }
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập giá");
        double price = sc.nextDouble();
        Product newProduct = new Product(id, name, price);
        productList.add(newProduct);
        System.out.println("Thêm mới thành công!");
    }

    public void removeProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        String id = sc.nextLine();
        if (getProductIndexById(id) == -1) {
            System.out.println("Id không hợp lệ!");
            return;
        }
        productList.remove(getProductIndexById(id));
        System.out.println("Xóa thành công!");
    }

    public void findProductByName() {
        System.out.println("Nhập từ khóa:");
        Scanner sc = new Scanner(System.in);
        String keyword=sc.nextLine().toLowerCase();
        for (Product product:productList){
            if (product.getProductName().toLowerCase().contains(keyword)){
                displayProduct(product);
            }
        }
    }

    public void editProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        String id = sc.nextLine();
        if (getProductIndexById(id) == -1) {
            System.out.println("Id không tồn tại!");
            return;
        }
        int currentIndex=getProductIndexById(id);
        String newId;
        do {
            System.out.println("Nhập id:");
            newId=sc.nextLine();
        } while (newId==null||currentIndex!=getProductIndexById(newId));
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        System.out.println("Nhập giá");
        double price = sc.nextDouble();
        Product updatedProduct = new Product(newId, name, price);
        productList.set(currentIndex,updatedProduct);
        System.out.println("Cập nhật thành công!");

    }

    public void sortByPrice() {
        List<Product> sortedList = new ArrayList<>(productList);
        Collections.sort(sortedList, Comparator.comparingDouble(Product::getPrice));
        System.out.println("Danh sách sản phâẩm sau khi sắp xếp theo giá:");
        for (Product product : sortedList) {
            displayProduct(product);
        }


    }
}
