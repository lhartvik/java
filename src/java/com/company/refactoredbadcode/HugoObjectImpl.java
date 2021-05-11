package com.company.refactoredbadcode;

import com.company.badcoder.Hugeobject;

public class HugoObjectImpl implements IHugeobject{

    private Hugeobject hugeobject;

    public HugoObjectImpl(Hugeobject hugeobject){
        this.hugeobject = hugeobject;
    }
    @Override
    public String getName() {
        return hugeobject.name != null ? hugeobject.name : "Unknown";
    }
}
