package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class yna implements SurfaceTexture.OnFrameAvailableListener {
    public ere X;
    public SurfaceTexture a;
    public Surface b;
    public final Object c = new Object();
    public boolean o;

    public yna() {
        int iC;
        int iGlCreateProgram;
        ere ereVar = new ere(1.0f, true);
        this.X = ereVar;
        int iC2 = ere.c(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
        if (iC2 == 0 || (iC = ere.c(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) == 0) {
            iGlCreateProgram = 0;
        } else {
            iGlCreateProgram = GLES20.glCreateProgram();
            ere.a("glCreateProgram");
            GLES20.glAttachShader(iGlCreateProgram, iC2);
            ere.a("glAttachShader");
            GLES20.glAttachShader(iGlCreateProgram, iC);
            ere.a("glAttachShader");
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glGetProgramInfoLog(iGlCreateProgram);
                GLES20.glDeleteProgram(iGlCreateProgram);
                iGlCreateProgram = 0;
            }
        }
        ereVar.i = iGlCreateProgram;
        if (iGlCreateProgram == 0) {
            throw new RuntimeException("failed creating program");
        }
        ereVar.m = GLES20.glGetAttribLocation(iGlCreateProgram, "aPosition");
        ere.a("glGetAttribLocation aPosition");
        if (ereVar.m == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        ereVar.n = GLES20.glGetAttribLocation(ereVar.i, jcg.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
        ere.a("glGetAttribLocation aTextureCoord");
        if (ereVar.n == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        ereVar.k = GLES20.glGetUniformLocation(ereVar.i, "uMVPMatrix");
        ere.a("glGetUniformLocation uMVPMatrix");
        if (ereVar.k == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        ereVar.l = GLES20.glGetUniformLocation(ereVar.i, "uSTMatrix");
        ere.a("glGetUniformLocation uSTMatrix");
        if (ereVar.l == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int i = iArr2[0];
        ereVar.j = i;
        GLES20.glBindTexture(36197, i);
        ere.a("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        ere.a("glTexParameter");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.X.j);
        this.a = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.b = new Surface(this.a);
    }

    public final void a() {
        this.b.release();
        this.X = null;
        this.b = null;
        this.a = null;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.c) {
            try {
                if (this.o) {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
                this.o = true;
                this.c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
