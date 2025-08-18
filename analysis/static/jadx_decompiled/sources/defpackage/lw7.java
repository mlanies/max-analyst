package defpackage;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class lw7 implements go0 {
    public int X;
    public final h7b a = new h7b(6);
    public final int b = 0;
    public final int c;
    public final o5b o;

    public lw7(int i, rq9 rq9Var) {
        this.c = i;
        this.o = rq9Var;
    }

    public final synchronized void a() {
        Bitmap bitmap;
        while (this.X > 0 && (bitmap = (Bitmap) this.a.u()) != null) {
            this.a.getClass();
            this.X -= qo0.d(bitmap);
            this.o.getClass();
        }
    }

    @Override // defpackage.pic
    public final void e(Object obj) {
        boolean zAdd;
        Bitmap bitmap = (Bitmap) obj;
        this.a.getClass();
        int iD = qo0.d(bitmap);
        if (iD <= this.c) {
            this.o.getClass();
            h7b h7bVar = this.a;
            h7bVar.getClass();
            if (h7b.r(bitmap)) {
                synchronized (h7bVar) {
                    zAdd = ((HashSet) h7bVar.b).add(bitmap);
                }
                if (zAdd) {
                    bkb bkbVar = (bkb) h7bVar.c;
                    int iD2 = qo0.d(bitmap);
                    synchronized (bkbVar) {
                        try {
                            qs0 qs0Var = (qs0) ((SparseArray) bkbVar.a).get(iD2);
                            if (qs0Var == null) {
                                LinkedList linkedList = new LinkedList();
                                qs0Var = new qs0();
                                qs0Var.a = null;
                                qs0Var.b = iD2;
                                qs0Var.c = linkedList;
                                qs0Var.d = null;
                                ((SparseArray) bkbVar.a).put(iD2, qs0Var);
                            }
                            qs0Var.c.addLast(bitmap);
                            if (((qs0) bkbVar.b) != qs0Var) {
                                bkbVar.t(qs0Var);
                                qs0 qs0Var2 = (qs0) bkbVar.b;
                                if (qs0Var2 == null) {
                                    bkbVar.b = qs0Var;
                                    bkbVar.c = qs0Var;
                                } else {
                                    qs0Var.d = qs0Var2;
                                    qs0Var2.a = qs0Var;
                                    bkbVar.b = qs0Var;
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            synchronized (this) {
                this.X += iD;
            }
        }
    }

    @Override // defpackage.l5b
    public final Object get(int i) {
        Bitmap bitmapG;
        synchronized (this) {
            try {
                if (this.X > this.b) {
                    a();
                }
                bitmapG = this.a.g(i);
                if (bitmapG != null) {
                    this.a.getClass();
                    this.X -= qo0.d(bitmapG);
                    this.o.getClass();
                } else {
                    this.o.getClass();
                    bitmapG = Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bitmapG;
    }
}
