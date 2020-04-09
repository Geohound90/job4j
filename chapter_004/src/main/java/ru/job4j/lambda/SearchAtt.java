package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class SearchAtt {
    public static List<Attachment> filter(List<Attachment> list, UnaryOperator<Attachment> func) {
        List<Attachment> rsl = new ArrayList<>();
        Attachment tmp;
        for (Attachment att : list) {
            tmp = func.apply(att);
            if (tmp != null) {
                rsl.add(tmp);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        UnaryOperator<Attachment> func = new UnaryOperator<Attachment>() {
            @Override
            public Attachment apply(Attachment attachment) {
                if (attachment.getSize() > 100) {
                    return attachment;
                } else {
                    return null;
                }
            }
        };
        return filter(list, func);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        UnaryOperator<Attachment> func = new UnaryOperator<Attachment>() {
            @Override
            public Attachment apply(Attachment attachment) {
                if (attachment.getName().contains("bug")) {
                    return attachment;
                } else {
                    return null;
                }
            }
        };
        return filter(list, func);
    }

    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("name 1", 50),
                new Attachment("name 2", 200),
                new Attachment("namebug 3", 110),
                new Attachment("name 3", 150)
        );
        System.out.println(SearchAtt.filterSize(attachments));
        System.out.println(SearchAtt.filterName(attachments));
    }
}
