package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;

/* loaded from: classes.dex */
public final class n76 extends m76 {
    public final int e;
    public final int f;
    public final int g;

    /* JADX WARN: Illegal instructions before constructor call */
    public n76(eu4 eu4Var, j76 j76Var) {
        String str = eu4Var.a() ? o76.d : o76.c;
        try {
            String strA = j76Var.a();
            if (!strA.contains(jcg.SHADER_VAR_TEXTURE_COORDINATES) || !strA.contains(jcg.FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER)) {
                throw new IllegalArgumentException("Invalid fragment shader");
            }
            super(str, strA);
            this.e = -1;
            this.f = -1;
            this.g = -1;
            a();
            int i = this.a;
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, jcg.FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
            this.e = iGlGetUniformLocation;
            o76.e(iGlGetUniformLocation, jcg.FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, jcg.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
            this.g = iGlGetAttribLocation;
            o76.e(iGlGetAttribLocation, jcg.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
            this.f = iGlGetUniformLocation2;
            o76.e(iGlGetUniformLocation2, "uTexMatrix");
        } catch (Throwable th) {
            if (!(th instanceof IllegalArgumentException)) {
                throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
            }
            throw th;
        }
    }

    @Override // defpackage.m76
    public final void b() {
        super.b();
        GLES20.glUniform1i(this.e, 0);
        GLES20.glEnableVertexAttribArray(this.g);
        o76.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 0, (Buffer) o76.i);
        o76.b("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n76(eu4 eu4Var, l76 l76Var) {
        j76 j76Var;
        if (eu4Var.a()) {
            c54.j("No default sampler shader available for" + l76Var, l76Var != l76.a);
            if (l76Var == l76.c) {
                j76Var = o76.g;
            } else {
                j76Var = o76.f;
            }
        } else {
            j76Var = o76.e;
        }
        this(eu4Var, j76Var);
    }
}
