package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class o76 {
    public static final int[] a = {12344};
    public static final int[] b = {12445, 13632, 12344};
    public static final String c;
    public static final String d;
    public static final j76 e;
    public static final j76 f;
    public static final j76 g;
    public static final FloatBuffer h;
    public static final FloatBuffer i;
    public static final db0 j;

    static {
        Locale locale = Locale.US;
        c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        e = new j76(0);
        f = new j76(1);
        g = new j76(2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        h = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        i = floatBufferAsFloatBuffer2;
        j = new db0(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbO = rh4.o(str, ": EGL error: 0x");
        sbO.append(Integer.toHexString(iEglGetError));
        throw new IllegalStateException(sbO.toString());
    }

    public static void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbO = rh4.o(str, ": GL error 0x");
        sbO.append(Integer.toHexString(iGlGetError));
        throw new IllegalStateException(sbO.toString());
    }

    public static void c(Thread thread) {
        c54.p("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static void d(AtomicBoolean atomicBoolean, boolean z) {
        c54.p(z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z == atomicBoolean.get());
    }

    public static void e(int i2, String str) {
        if (i2 < 0) {
            throw new IllegalStateException(zr6.i("Unable to locate '", str, "' in program"));
        }
    }

    public static HashMap f(eu4 eu4Var, Map map) {
        Object n76Var;
        l76 l76Var;
        HashMap map2 = new HashMap();
        l76[] l76VarArrValues = l76.values();
        int length = l76VarArrValues.length;
        for (int i2 = 0; i2 < length; i2++) {
            l76 l76Var2 = l76VarArrValues[i2];
            j76 j76Var = (j76) map.get(l76Var2);
            if (j76Var != null) {
                n76Var = new n76(eu4Var, j76Var);
            } else if (l76Var2 == l76.c || l76Var2 == (l76Var = l76.b)) {
                n76Var = new n76(eu4Var, l76Var2);
            } else {
                c54.p("Unhandled input format: " + l76Var2, l76Var2 == l76.a);
                if (eu4Var.a()) {
                    n76Var = new k76("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    j76 j76Var2 = (j76) map.get(l76Var);
                    n76Var = j76Var2 != null ? new n76(eu4Var, j76Var2) : new n76(eu4Var, l76Var);
                }
            }
            Objects.toString(l76Var2);
            n76Var.toString();
            map2.put(l76Var2, n76Var);
        }
        return map2;
    }

    public static int g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        b("glBindTexture " + i2);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i2;
    }

    public static EGLSurface h(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static String i() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return rh4.j(strGroup, ".", strGroup2);
    }

    public static int j(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        b("glCreateShader type=" + i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        GLES20.glDeleteShader(iGlCreateShader);
        StringBuilder sbN = rh4.n(i2, "Could not compile shader type ", ":");
        sbN.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        throw new IllegalStateException(sbN.toString());
    }
}
