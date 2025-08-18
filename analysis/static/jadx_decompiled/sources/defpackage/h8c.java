package defpackage;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class h8c implements gcg {
    public int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public h8c(int i, int i2, float[] fArr, float[] fArr2) {
        this.f = IntBuffer.allocate(1);
        this.g = IntBuffer.allocate(2);
        this.a = i;
        this.b = i2;
        this.c = 2;
        this.e = 5;
        this.d = 4;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        this.h = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(fArr2.length * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArr2);
        floatBufferAsFloatBuffer2.position(0);
        this.i = floatBufferAsFloatBuffer2;
    }

    public static h8c c(h8c h8cVar, int i, od odVar, mhc mhcVar, int i2) {
        if ((i2 & 1) != 0) {
            i = h8cVar.b;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            odVar = (od) h8cVar.h;
        }
        od odVar2 = odVar;
        if ((i2 & 4) != 0) {
            mhcVar = (mhc) h8cVar.i;
        }
        int i4 = h8cVar.c;
        int i5 = h8cVar.d;
        int i6 = h8cVar.e;
        return new h8c((b8c) h8cVar.f, (List) h8cVar.g, i3, odVar2, mhcVar, i4, i5, i6);
    }

    @Override // defpackage.gcg
    public void a() {
        FloatBuffer floatBuffer;
        IntBuffer intBuffer = (IntBuffer) this.f;
        if (intBuffer.get(0) == 0) {
            FloatBuffer floatBuffer2 = (FloatBuffer) this.h;
            if (floatBuffer2 == null || (floatBuffer = (FloatBuffer) this.i) == null) {
                return;
            }
            GLES30.glGenVertexArrays(1, intBuffer);
            IntBuffer intBuffer2 = (IntBuffer) this.g;
            GLES20.glGenBuffers(2, intBuffer2);
            GLES20.glBindBuffer(34962, intBuffer2.get(0));
            nd7.b("glBindBuffer");
            GLES20.glBufferData(34962, floatBuffer2.remaining() * 4, floatBuffer2, 35044);
            nd7.b("glBufferData");
            GLES20.glBindBuffer(34962, 0);
            nd7.b("glBindBuffer");
            GLES20.glBindBuffer(34962, intBuffer2.get(1));
            nd7.b("glBindBuffer");
            GLES20.glBufferData(34962, floatBuffer.remaining() * 4, floatBuffer, 35044);
            nd7.b("glBufferData");
            GLES20.glBindBuffer(34962, 0);
            nd7.b("glBindBuffer");
            GLES30.glBindVertexArray(intBuffer.get(0));
            nd7.b("glBindVertexArray");
            intBuffer2.rewind();
            GLES20.glBindBuffer(34962, intBuffer2.get(0));
            nd7.b("glBindBuffer");
            int i = this.c;
            GLES20.glVertexAttribPointer(this.a, i, 5126, false, i * 4, 0);
            nd7.b("glVertexAttribPointer");
            GLES20.glBindBuffer(34962, 0);
            nd7.b("glBindBuffer");
            intBuffer2.rewind();
            GLES20.glBindBuffer(34962, intBuffer2.get(1));
            nd7.b("glBindBuffer");
            GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 8, 0);
            nd7.b("glVertexAttribPointer");
            GLES20.glBindBuffer(34962, 0);
            nd7.b("glBindBuffer");
            GLES30.glBindVertexArray(0);
            nd7.b("glBindVertexArray");
        }
        GLES30.glBindVertexArray(intBuffer.get(0));
        nd7.b("glBindVertexArray");
        int i2 = this.a;
        GLES20.glEnableVertexAttribArray(i2);
        nd7.b("glEnableVertexAttribArray");
        int i3 = this.b;
        GLES20.glEnableVertexAttribArray(i3);
        nd7.b("glEnableVertexAttribArray");
        GLES20.glDrawArrays(this.e, 0, this.d);
        nd7.b("glDrawArrays");
        GLES20.glDisableVertexAttribArray(i2);
        nd7.b("glDisableVertexAttribArray");
        GLES20.glDisableVertexAttribArray(i3);
        nd7.b("glDisableVertexAttribArray");
        GLES30.glBindVertexArray(0);
        nd7.b("glBindVertexArray");
    }

    @Override // defpackage.gcg
    public void b() {
        GLES20.glDeleteBuffers(2, (IntBuffer) this.g);
        nd7.b("glDeleteBuffers");
        GLES30.glDeleteVertexArrays(1, (IntBuffer) this.f);
        nd7.b("glDeleteVertexArrays");
    }

    public yic d(mhc mhcVar) {
        List list = (List) this.g;
        int size = list.size();
        int i = this.b;
        if (i >= size) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.a++;
        od odVar = (od) this.h;
        if (odVar != null) {
            vq6 vq6Var = mhcVar.b;
            vq6 vq6Var2 = ((v45) odVar.X).h.a;
            if (vq6Var.f != vq6Var2.f || !tpa.f(vq6Var.e, vq6Var2.e)) {
                throw new IllegalStateException(("network interceptor " + ((p37) list.get(i - 1)) + " must retain the same host and port").toString());
            }
            if (this.a != 1) {
                throw new IllegalStateException(("network interceptor " + ((p37) list.get(i - 1)) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        h8c h8cVarC = c(this, i2, null, mhcVar, 58);
        p37 p37Var = (p37) list.get(i);
        yic yicVarA = p37Var.a(h8cVarC);
        if (yicVarA == null) {
            throw new NullPointerException("interceptor " + p37Var + " returned null");
        }
        if (odVar != null && i2 < list.size() && h8cVarC.a != 1) {
            throw new IllegalStateException(("network interceptor " + p37Var + " must call proceed() exactly once").toString());
        }
        if (yicVarA.Z != null) {
            return yicVarA;
        }
        throw new IllegalStateException(("interceptor " + p37Var + " returned a response with no body").toString());
    }

    public h8c(b8c b8cVar, List list, int i, od odVar, mhc mhcVar, int i2, int i3, int i4) {
        this.f = b8cVar;
        this.g = list;
        this.b = i;
        this.h = odVar;
        this.i = mhcVar;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
