package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class bfe {
    public static final bfe a;
    public static final bfe b;
    public static final bfe c;
    public static final /* synthetic */ bfe[] o;

    static {
        bfe bfeVar = new bfe("ALREADY_DOWNLOADING_BY_OTHER", 0);
        a = bfeVar;
        bfe bfeVar2 = new bfe("FINISH", 1);
        b = bfeVar2;
        bfe bfeVar3 = new bfe("ERROR", 2);
        c = bfeVar3;
        o = new bfe[]{bfeVar, bfeVar2, bfeVar3};
    }

    public static bfe valueOf(String str) {
        return (bfe) Enum.valueOf(bfe.class, str);
    }

    public static bfe[] values() {
        return (bfe[]) o.clone();
    }
}
