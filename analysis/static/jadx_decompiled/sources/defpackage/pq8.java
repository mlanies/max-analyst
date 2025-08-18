package defpackage;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;

/* loaded from: classes.dex */
public abstract class pq8 extends mj0 {
    public final int[] v0;

    public pq8(sq8 sq8Var, n5b n5bVar, o5b o5bVar) {
        super(sq8Var, n5bVar, o5bVar);
        SparseIntArray sparseIntArray = n5bVar.c;
        sparseIntArray.getClass();
        this.v0 = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.v0;
            if (i >= iArr.length) {
                this.b.getClass();
                this.t0.getClass();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }

    @Override // defpackage.mj0
    public final void c(Object obj) {
        oq8 oq8Var = (oq8) obj;
        oq8Var.getClass();
        oq8Var.close();
    }

    @Override // defpackage.mj0
    public final int f(int i) {
        if (i <= 0) {
            throw new BasePool$InvalidSizeException(Integer.valueOf(i));
        }
        for (int i2 : this.v0) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // defpackage.mj0
    public final int g(Object obj) {
        oq8 oq8Var = (oq8) obj;
        oq8Var.getClass();
        return oq8Var.getSize();
    }

    @Override // defpackage.mj0
    public final int h(int i) {
        return i;
    }

    @Override // defpackage.mj0
    public final boolean k(Object obj) {
        ((oq8) obj).getClass();
        return !r1.isClosed();
    }
}
