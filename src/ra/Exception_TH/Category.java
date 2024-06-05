package ra.Exception_TH;

import java.util.Scanner;

public class Category implements IEntity {
    private int catalogId;
    private String catalogName;
    private boolean catalogStatus;

    public Category() {
    }

    public Category(int catalogId, String catalogName, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void input(Scanner scanner, Category[] arrCategories, int indexCatalog) {
        this.catalogId = inputCatalogId(scanner, arrCategories, indexCatalog);
        this.catalogName = inputCalalogName(scanner, arrCategories, indexCatalog);
        this.catalogStatus = inputCatalogStatus(scanner);
    }

    public int inputCatalogId(Scanner scanner, Category[] arrCategories, int indexCatalog) {
        System.out.println("Nhập vào mã danh mục:");
        do {
            try {
                int catalogId = Integer.parseInt(scanner.nextLine());
                boolean isExist = false;
                for (int i = 0; i < indexCatalog; i++) {
                    if (arrCategories[indexCatalog].getCatalogId() == catalogId) {
                        isExist = true;
                        break;
                    }
                }
                if (isExist) {
                    System.err.println("Tên danh mục đã tồn tại, vui lòng nhập lại");
                } else {
                    return catalogId;
                }
                if (catalogId > 0) {
                    return catalogId;
                } else {
                    System.err.println("Mã danh mục lớn hơn 0");
                }
            } catch (NumberFormatException ex) {
                System.err.println("Mã danh mục phải là số nguyên");
            }
        } while (true);
    }

    public String inputCalalogName(Scanner scanner, Category[] arrCategories, int indexCatalog) {
        System.out.println("Nhập vào tên danh mục");
        do {
            String catalogName = scanner.nextLine();
            if (catalogName.length() >= 6 && catalogName.length() <= 30) {
                boolean isExist = false;
                for (int i = 0; i < indexCatalog; i++) {
                    if (arrCategories[indexCatalog].getCatalogName().equals(catalogName)) {
                        isExist = true;
                        break;
                    }
                }
                if (isExist) {
                    System.err.println("Tên danh mục đã tồn tại, vui lòng nhập lại");
                } else {
                    return catalogName;
                }
            } else {
                System.err.println("Tên phải có từ 6-30 ký tự, vui lòng nhập lại");
            }
        } while (true);
    }

    public boolean inputCatalogStatus(Scanner scanner) {
        System.out.println("Nhập vào trạng thái danh mục");
        do {
            String catalogStatus = scanner.nextLine();
            if (catalogStatus.equals("true") || catalogStatus.equals("false")) {
                return Boolean.parseBoolean(catalogStatus);
            } else {
                System.err.println("Trạng thái danh mục chỉ nhận giá trị true | false, vui lòng nhập lại");
            }
        } while (true);
    }

    @Override
    public void ouput() {
        System.out.printf("Mã danh mục: %d - Tên danh mục: %s - Trạng thái: %s", this.catalogId, this.catalogName, this.catalogStatus ? "Hoạt động" : "Không hoạt động");
    }
}
