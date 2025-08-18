package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kbf extends lbf {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public final int k;
    public String l;

    public kbf() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.l = null;
    }

    @Override // defpackage.lbf
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((lbf) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.lbf
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((lbf) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.l;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kbf(kbf kbfVar, us usVar) {
        ibf ibfVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.l = null;
        this.c = kbfVar.c;
        this.d = kbfVar.d;
        this.e = kbfVar.e;
        this.f = kbfVar.f;
        this.g = kbfVar.g;
        this.h = kbfVar.h;
        this.i = kbfVar.i;
        String str = kbfVar.l;
        this.l = str;
        this.k = kbfVar.k;
        if (str != null) {
            usVar.put(str, this);
        }
        matrix.set(kbfVar.j);
        ArrayList arrayList = kbfVar.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof kbf) {
                this.b.add(new kbf((kbf) obj, usVar));
            } else {
                if (obj instanceof jbf) {
                    jbf jbfVar = (jbf) obj;
                    jbf jbfVar2 = new jbf(jbfVar);
                    jbfVar2.f = 0.0f;
                    jbfVar2.h = 1.0f;
                    jbfVar2.i = 1.0f;
                    jbfVar2.j = 0.0f;
                    jbfVar2.k = 1.0f;
                    jbfVar2.l = 0.0f;
                    jbfVar2.m = Paint.Cap.BUTT;
                    jbfVar2.n = Paint.Join.MITER;
                    jbfVar2.o = 4.0f;
                    jbfVar2.e = jbfVar.e;
                    jbfVar2.f = jbfVar.f;
                    jbfVar2.h = jbfVar.h;
                    jbfVar2.g = jbfVar.g;
                    jbfVar2.c = jbfVar.c;
                    jbfVar2.i = jbfVar.i;
                    jbfVar2.j = jbfVar.j;
                    jbfVar2.k = jbfVar.k;
                    jbfVar2.l = jbfVar.l;
                    jbfVar2.m = jbfVar.m;
                    jbfVar2.n = jbfVar.n;
                    jbfVar2.o = jbfVar.o;
                    ibfVar = jbfVar2;
                } else if (obj instanceof ibf) {
                    ibfVar = new ibf((ibf) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(ibfVar);
                Object obj2 = ibfVar.b;
                if (obj2 != null) {
                    usVar.put(obj2, ibfVar);
                }
            }
        }
    }
}
