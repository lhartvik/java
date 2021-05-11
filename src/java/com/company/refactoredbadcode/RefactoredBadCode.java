package com.company.refactoredbadcode;

import com.company.badcoder.Hugeobject;

public class RefactoredBadCode {
    public static String fullName(IHugeobject hugo) {
        return hugo.getName() + " Coderson";
    }

    public static String fullName(Hugeobject hugo) {
        return fullName(new HugoObjectImpl(hugo));
    }
}
