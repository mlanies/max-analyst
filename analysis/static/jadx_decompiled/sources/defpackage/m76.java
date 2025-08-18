package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;

/* loaded from: classes.dex */
public abstract class m76 {
    public final int a;
    public int b = -1;
    public int c = -1;
    public int d = -1;

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m76(java.lang.String r8, java.lang.String r9) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "glAttachShader"
            java.lang.String r1 = "Could not link program: "
            r7.<init>()
            r2 = -1
            r7.b = r2
            r7.c = r2
            r7.d = r2
            r3 = 35633(0x8b31, float:4.9932E-41)
            int r8 = defpackage.o76.j(r3, r8)     // Catch: java.lang.Throwable -> L67
            r3 = 35632(0x8b30, float:4.9931E-41)
            int r9 = defpackage.o76.j(r3, r9)     // Catch: java.lang.Throwable -> L63
            int r3 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = "glCreateProgram"
            defpackage.o76.b(r4)     // Catch: java.lang.Throwable -> L48
            android.opengl.GLES20.glAttachShader(r3, r8)     // Catch: java.lang.Throwable -> L48
            defpackage.o76.b(r0)     // Catch: java.lang.Throwable -> L48
            android.opengl.GLES20.glAttachShader(r3, r9)     // Catch: java.lang.Throwable -> L48
            defpackage.o76.b(r0)     // Catch: java.lang.Throwable -> L48
            android.opengl.GLES20.glLinkProgram(r3)     // Catch: java.lang.Throwable -> L48
            r0 = 1
            int[] r4 = new int[r0]     // Catch: java.lang.Throwable -> L48
            r5 = 35714(0x8b82, float:5.0046E-41)
            r6 = 0
            android.opengl.GLES20.glGetProgramiv(r3, r5, r4, r6)     // Catch: java.lang.Throwable -> L48
            r4 = r4[r6]     // Catch: java.lang.Throwable -> L48
            if (r4 != r0) goto L4a
            r7.a = r3     // Catch: java.lang.Throwable -> L48
            r7.a()
            return
        L48:
            r7 = move-exception
            goto L6b
        L4a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r3)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            r0.append(r1)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
            throw r7     // Catch: java.lang.Throwable -> L48 java.lang.Throwable -> L48
        L60:
            r7 = move-exception
            r3 = r2
            goto L6b
        L63:
            r7 = move-exception
            r9 = r2
        L65:
            r3 = r9
            goto L6b
        L67:
            r7 = move-exception
            r8 = r2
            r9 = r8
            goto L65
        L6b:
            if (r8 == r2) goto L70
            android.opengl.GLES20.glDeleteShader(r8)
        L70:
            if (r9 == r2) goto L75
            android.opengl.GLES20.glDeleteShader(r9)
        L75:
            if (r3 == r2) goto L7a
            android.opengl.GLES20.glDeleteProgram(r3)
        L7a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m76.<init>(java.lang.String, java.lang.String):void");
    }

    public final void a() {
        int i = this.a;
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        this.d = iGlGetAttribLocation;
        o76.e(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
        this.b = iGlGetUniformLocation;
        o76.e(iGlGetUniformLocation, "uTransMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
        this.c = iGlGetUniformLocation2;
        o76.e(iGlGetUniformLocation2, "uAlphaScale");
    }

    public void b() {
        GLES20.glUseProgram(this.a);
        o76.b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.d);
        o76.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) o76.h);
        o76.b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.b, 1, false, fArr, 0);
        o76.b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.c, 1.0f);
        o76.b("glUniform1f");
    }
}
