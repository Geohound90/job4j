package ru.job4j.lambda;

import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 70),
                new Attachment("image 2", 22),
                new Attachment("image 3", 10)
        );
        Comparator<Attachment> sizeDesc = (left, right) -> {
            System.out.println("compare sizes: " + right.getSize() + " - " + left.getSize());
            return right.getSize() - left.getSize();
        };
        attachments.sort(sizeDesc);
        System.out.println(attachments);
        Comparator<Attachment> nameDesc = (left, right) -> {
            System.out.println("compare names: " + right.getName() + " - " + left.getName());
            return right.getName().compareTo(left.getName());
        };
        attachments.sort(nameDesc);
        System.out.println(attachments);
    }
}
