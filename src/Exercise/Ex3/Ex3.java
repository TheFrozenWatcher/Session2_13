package Exercise.Ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        ProductManager productCrud = new ProductManager();
        byte choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả sản phẩm.");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sửa thông tin sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm theo tên sản phẩm");
            System.out.println("6. Sắp xếp theo giá");
            System.out.println("7. Thoát chương trình");
            System.out.println("Nhập lựa chọn:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextByte();
            switch (choice) {
                case 1:
                    productCrud.showAll();
                    break;
                case 2:
                    productCrud.addProduct();
                    break;
                case 3:
                    productCrud.editProduct();
                    break;
                case 4:
                    productCrud.removeProduct();
                    break;
                case 5:
                    productCrud.findProductByName();
                    break;
                case 6:
                    productCrud.sortByPrice();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }

        } while (choice != 7);
    }
}
