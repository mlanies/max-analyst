package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class jcg {
    public static final String FRAGMENT_SHADER_UNI_COLOR_MATRIX = "colorMatrix";
    public static final String FRAGMENT_SHADER_UNI_TEXTURE_ALPHA = "texAlpha";
    public static final String FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER = "sTexture";
    private static final String LOG_TAG = "GLProgram";
    public static final String SHADER_VAR_TEXTURE_COORDINATES = "vTextureCoord";
    public static final String VERTEX_SHADER_ATTR_TEXTURE_COORDINATES = "aTextureCoord";
    public static final String VERTEX_SHADER_ATTR_VERTEXT_COORDINATES = "aVertexCoord";
    public static final String VERTEX_SHADER_UNI_MVP_MATRIX = "mvpMatrix";
    public static final String VERTEX_SHADER_UNI_TEXTURE_MATRIX = "texMatrix";
    private final int aTextureCoordLoc;
    private final int aVertexCoordLoc;
    private final int alphaLocation;
    private int firstFreeTexture;
    private ybg frame;
    private float[] mvpMat;
    private final int mvpMatrixLoc;
    protected final int programId;
    private float[] texMat;
    private final int texMatrixLoc;
    private int textureId;
    private final int textureLocation;
    private float alpha = 1.0f;
    private HashMap<Integer, Object> customParams = new HashMap<>();

    public jcg(String str) {
        int iD = nd7.d(35633, "precision mediump float;\nuniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute vec4 aVertexCoord;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = mvpMatrix * aVertexCoord;\n   vTextureCoord = (texMatrix * aTextureCoord).xy;\n}\n");
        if (iD == 0) {
            throw new RuntimeException("Failed to load vertex shader");
        }
        int iD2 = nd7.d(35632, str);
        if (iD2 == 0) {
            throw new RuntimeException("Failed to load fragment shader");
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.programId = iGlCreateProgram;
        nd7.b("glCreateProgram");
        GLES20.glAttachShader(iGlCreateProgram, iD);
        nd7.b("glAttachShader");
        GLES20.glDeleteShader(iD);
        nd7.b("glDeleteShader");
        GLES20.glAttachShader(iGlCreateProgram, iD2);
        nd7.b("glAttachShader");
        GLES20.glDeleteShader(iD2);
        nd7.b("glDeleteShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            hm9.o(LOG_TAG, "Could not link program: ");
            hm9.o(LOG_TAG, GLES20.glGetProgramInfoLog(iGlCreateProgram));
            GLES20.glDeleteProgram(iGlCreateProgram);
            throw new RuntimeException("create program failed");
        }
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(iGlCreateProgram, VERTEX_SHADER_ATTR_VERTEXT_COORDINATES);
        this.aVertexCoordLoc = iGlGetAttribLocation;
        nd7.a(iGlGetAttribLocation, VERTEX_SHADER_ATTR_VERTEXT_COORDINATES);
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(iGlCreateProgram, VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
        this.aTextureCoordLoc = iGlGetAttribLocation2;
        nd7.a(iGlGetAttribLocation2, VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(iGlCreateProgram, VERTEX_SHADER_UNI_MVP_MATRIX);
        this.mvpMatrixLoc = iGlGetUniformLocation;
        nd7.a(iGlGetUniformLocation, VERTEX_SHADER_UNI_MVP_MATRIX);
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(iGlCreateProgram, VERTEX_SHADER_UNI_TEXTURE_MATRIX);
        this.texMatrixLoc = iGlGetUniformLocation2;
        nd7.a(iGlGetUniformLocation2, VERTEX_SHADER_UNI_TEXTURE_MATRIX);
        int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(iGlCreateProgram, FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
        this.textureLocation = iGlGetUniformLocation3;
        this.alphaLocation = GLES20.glGetUniformLocation(iGlCreateProgram, FRAGMENT_SHADER_UNI_TEXTURE_ALPHA);
        nd7.a(iGlGetUniformLocation3, FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
        this.frame = new ybg(iGlGetAttribLocation, iGlGetAttribLocation2);
    }

    public abstract int getTarget();

    public int getTextureCoordLoc() {
        return this.aTextureCoordLoc;
    }

    public int getVertexCoordLoc() {
        return this.aVertexCoordLoc;
    }

    public int registerTexture(int i, int i2, String str) {
        GLES20.glActiveTexture(this.firstFreeTexture + 33984);
        nd7.b("glActiveTexture " + str);
        GLES20.glBindTexture(i, i2);
        nd7.b("glBindTexture " + str);
        int i3 = this.firstFreeTexture;
        this.firstFreeTexture = i3 + 1;
        return i3;
    }

    public void release() {
        this.frame.a.b();
        GLES20.glDeleteProgram(this.programId);
    }

    public void render() {
        use();
        this.frame.a.a();
        unUse();
    }

    public void setCustomParameter(String str, float f) {
        this.customParams.put(Integer.valueOf(GLES20.glGetUniformLocation(this.programId, str)), Float.valueOf(f));
    }

    public void setMVPMat(float[] fArr) {
        this.mvpMat = fArr;
    }

    public void setTexMat(float[] fArr) {
        this.texMat = fArr;
    }

    public void setTextureAlpha(float f) {
        this.alpha = f;
    }

    public void setTextureId(int i) {
        this.textureId = i;
    }

    public void unUse() {
        GLES20.glUseProgram(0);
        nd7.b("glUseProgram");
    }

    public void use() {
        this.firstFreeTexture = 0;
        if (this.mvpMat == null) {
            float[] fArr = new float[16];
            this.mvpMat = fArr;
            Matrix.setIdentityM(fArr, 0);
        }
        if (this.texMat == null) {
            float[] fArr2 = new float[16];
            this.texMat = fArr2;
            Matrix.setIdentityM(fArr2, 0);
        }
        GLES20.glUseProgram(this.programId);
        nd7.b("glUseProgram");
        GLES20.glUniformMatrix4fv(this.mvpMatrixLoc, 1, false, this.mvpMat, 0);
        nd7.b("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.texMatrixLoc, 1, false, this.texMat, 0);
        nd7.b("glUniformMatrix4fv");
        GLES20.glUniform1i(this.textureLocation, registerTexture(getTarget(), this.textureId, "textureId"));
        nd7.b("glUniform1i");
        GLES20.glUniform1f(this.alphaLocation, this.alpha);
        nd7.b("glUniform1f");
        for (Integer num : this.customParams.keySet()) {
            int iIntValue = num.intValue();
            Object orDefault = this.customParams.getOrDefault(num, Float.valueOf(0.0f));
            if (orDefault instanceof Float) {
                GLES20.glUniform1f(iIntValue, ((Float) orDefault).floatValue());
            } else if (orDefault instanceof Integer) {
                GLES20.glUniform1i(iIntValue, ((Integer) orDefault).intValue());
            }
        }
        nd7.b("set custom");
    }

    public void setCustomParameter(String str, int i) {
        this.customParams.put(Integer.valueOf(GLES20.glGetUniformLocation(this.programId, str)), Integer.valueOf(i));
    }
}
