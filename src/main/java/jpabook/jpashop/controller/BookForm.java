package jpabook.jpashop.controller;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BookForm {
    private Long id; // 수정때문에
    private String name;
    private int price;
    private int stockQuantity;
    private String author;
    private String isbn;
}