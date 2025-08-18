package defpackage;

import android.opengl.GLES20;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qxd implements gcg {
    public int a;
    public int b;
    public int c;
    public final int d;
    public final Object e;
    public final Object f;

    public qxd(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = i;
        this.b = i2;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        this.e = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(fArr2.length * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArr2);
        floatBufferAsFloatBuffer2.position(0);
        this.f = floatBufferAsFloatBuffer2;
        this.d = 5;
        this.c = 4;
    }

    @Override // defpackage.gcg
    public void a() {
        if (((FloatBuffer) this.e) == null || ((FloatBuffer) this.f) == null) {
            return;
        }
        int i = this.a;
        GLES20.glEnableVertexAttribArray(i);
        nd7.b("glEnableVertexAttribArray");
        int i2 = this.b;
        GLES20.glEnableVertexAttribArray(i2);
        nd7.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.a, 2, 5126, false, 8, (Buffer) this.e);
        nd7.b("glVertexAttribPointer");
        GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 8, (Buffer) this.f);
        nd7.b("glVertexAttribPointer");
        GLES20.glDrawArrays(this.d, 0, this.c);
        nd7.b("glDrawArrays");
        GLES20.glDisableVertexAttribArray(i);
        nd7.b("glDisableVertexAttribArray");
        GLES20.glDisableVertexAttribArray(i2);
        nd7.b("glDisableVertexAttribArray");
    }

    @Override // defpackage.gcg
    public void b() {
    }

    public void c() {
        View view = (View) wg0.f((ArrayList) this.e, 1);
        nxd nxdVar = (nxd) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.f).r.c(view);
        nxdVar.getClass();
    }

    public void d() {
        ((ArrayList) this.e).clear();
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = 0;
    }

    public int e() {
        boolean z = ((StaggeredGridLayoutManager) this.f).w;
        ArrayList arrayList = (ArrayList) this.e;
        return z ? g(arrayList.size() - 1, -1, false, true) : g(0, arrayList.size(), false, true);
    }

    public int f() {
        boolean z = ((StaggeredGridLayoutManager) this.f).w;
        ArrayList arrayList = (ArrayList) this.e;
        return z ? g(0, arrayList.size(), false, true) : g(arrayList.size() - 1, -1, false, true);
    }

    public int g(int i, int i2, boolean z, boolean z2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        int iM = staggeredGridLayoutManager.r.m();
        int iH = staggeredGridLayoutManager.r.h();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.e).get(i);
            int iF = staggeredGridLayoutManager.r.f(view);
            int iC = staggeredGridLayoutManager.r.c(view);
            boolean z3 = false;
            boolean z4 = !z2 ? iF >= iH : iF > iH;
            if (!z2 ? iC > iM : iC >= iM) {
                z3 = true;
            }
            if (z4 && z3) {
                if (z) {
                    return a.M(view);
                }
                if (iF < iM || iC > iH) {
                    return a.M(view);
                }
            }
            i += i3;
        }
        return -1;
    }

    public int h(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.e).size() == 0) {
            return i;
        }
        c();
        return this.b;
    }

    public View i(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && a.M(view2) >= i) || ((!staggeredGridLayoutManager.w && a.M(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.w && a.M(view3) <= i) || ((!staggeredGridLayoutManager.w && a.M(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public int j(int i) {
        int i2 = this.a;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.e).size() == 0) {
            return i;
        }
        View view = (View) ((ArrayList) this.e).get(0);
        nxd nxdVar = (nxd) view.getLayoutParams();
        this.a = ((StaggeredGridLayoutManager) this.f).r.f(view);
        nxdVar.getClass();
        return this.a;
    }

    public qxd(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = new ArrayList();
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = 0;
        this.d = i;
    }
}
