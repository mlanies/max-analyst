package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zx4 {
    public int a = 1;
    public final s99 b;
    public s99 c;
    public s99 d;
    public int e;
    public int f;
    public final boolean g;
    public final int[] h;

    public zx4(s99 s99Var, boolean z, int[] iArr) {
        this.b = s99Var;
        this.c = s99Var;
        this.g = z;
        this.h = iArr;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        int[] iArr;
        l99 l99VarC = this.c.b.c();
        int iA = l99VarC.a(6);
        if ((iA == 0 || ((ByteBuffer) l99VarC.o).get(iA + l99VarC.a) == 0) && this.e != 65039) {
            return this.g && ((iArr = this.h) == null || Arrays.binarySearch(iArr, this.c.b.a(0)) < 0);
        }
        return true;
    }
}
