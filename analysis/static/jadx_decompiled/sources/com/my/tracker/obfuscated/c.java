package com.my.tracker.obfuscated;

import defpackage.au1;

/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final int b;

    public c(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppSetIdData{id='");
        sb.append(this.a);
        sb.append("', scope=");
        return au1.h(sb, this.b, '}');
    }
}
