package defpackage;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;

/* loaded from: classes.dex */
public class ja6 extends mj0 {
    public final int[] v0;

    public ja6(qq9 qq9Var, n5b n5bVar, rq9 rq9Var) {
        super(qq9Var, n5bVar, rq9Var);
        SparseIntArray sparseIntArray = n5bVar.c;
        if (sparseIntArray != null) {
            this.v0 = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                this.v0[i] = sparseIntArray.keyAt(i);
            }
        } else {
            this.v0 = new int[0];
        }
        this.b.getClass();
        this.t0.getClass();
    }

    @Override // defpackage.mj0
    public final Object a(int i) {
        return new byte[i];
    }

    @Override // defpackage.mj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
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
        return ((byte[]) obj).length;
    }

    @Override // defpackage.mj0
    public final int h(int i) {
        return i;
    }
}
