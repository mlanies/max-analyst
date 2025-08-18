package defpackage;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z3f {
    public static final z3f X;
    public static final z3f Y;
    public static final z3f Z;
    public static final ob6 b;
    public static final LinkedHashMap c;
    public static final z3f o;
    public static final z3f s0;
    public static final z3f t0;
    public static final z3f u0;
    public static final z3f v0;
    public static final /* synthetic */ z3f[] w0;
    public final int a;

    static {
        z3f z3fVar = new z3f("INTEGER", 0, 0);
        o = z3fVar;
        z3f z3fVar2 = new z3f("FLOAT", 1, 1);
        X = z3fVar2;
        z3f z3fVar3 = new z3f("LONG", 2, 2);
        Y = z3fVar3;
        z3f z3fVar4 = new z3f("STRING", 3, 3);
        Z = z3fVar4;
        z3f z3fVar5 = new z3f("STRINGS_SET", 4, 4);
        s0 = z3fVar5;
        z3f z3fVar6 = new z3f("BOOLEAN", 5, 5);
        t0 = z3fVar6;
        z3f z3fVar7 = new z3f("BIG_STRING", 6, 16);
        u0 = z3fVar7;
        z3f z3fVar8 = new z3f("BIG_STRINGS_SET", 7, 17);
        v0 = z3fVar8;
        z3f[] z3fVarArr = {z3fVar, z3fVar2, z3fVar3, z3fVar4, z3fVar5, z3fVar6, z3fVar7, z3fVar8};
        w0 = z3fVarArr;
        v25 v25Var = new v25(z3fVarArr);
        b = new ob6();
        int iZ = mz7.Z(z53.S(v25Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iZ >= 16 ? iZ : 16);
        u1 u1Var = new u1(0, v25Var);
        while (u1Var.hasNext()) {
            Object next = u1Var.next();
            linkedHashMap.put(Integer.valueOf(((z3f) next).a), next);
        }
        c = linkedHashMap;
    }

    public z3f(String str, int i, int i2) {
        this.a = i2;
    }

    public static z3f valueOf(String str) {
        return (z3f) Enum.valueOf(z3f.class, str);
    }

    public static z3f[] values() {
        return (z3f[]) w0.clone();
    }

    public final int a() {
        return this == v0 ? u0.a() : this.a;
    }
}
