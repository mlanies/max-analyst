package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
public final class cjd implements GLSurfaceView.Renderer {
    public FloatBuffer X;
    public long Y;
    public int Z;
    public int a;
    public int b;
    public int c;
    public int o;
    public int s0;

    public static int a(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new RuntimeException(wg0.i("Error compiling shader: ", strGlGetShaderInfoLog));
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16384);
        GLES20.glUniform1f(this.b, (System.currentTimeMillis() - this.Y) / 1000.0f);
        GLES20.glUniform2f(this.c, this.Z, this.s0);
        GLES20.glEnableVertexAttribArray(this.o);
        int i = this.o;
        FloatBuffer floatBuffer = this.X;
        if (floatBuffer == null) {
            floatBuffer = null;
        }
        GLES20.glVertexAttribPointer(i, 2, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.o);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        this.Z = i;
        this.s0 = i2;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        this.X = floatBufferAsFloatBuffer;
        int iA = a(35633, "\n            attribute vec4 vPosition;\n            void main() {\n                gl_Position = vPosition;\n            }\n        ");
        int iA2 = a(35632, "\n            #define PI 3.14159\n            \n            precision mediump float;\n            \n            uniform float time;\n            uniform vec2 resolution;\n            \n            // Униформы для настройки параметров\n            const float numBeams = 128.0;        // Количество лучей\n            const float tunnelStretch = 0.05;   // Растяжение туннеля\n            const float offsetFreq = 215.4;      // Частота смещения\n            const float speedFreq = 33.1;       // Частота скорости\n            const float trailStart = 6.0;      // Начало луча\n            const float trailEnd = 33.0;        // Конец луча\n            const float amplitude = 5.0;       // Амплитуда лучей\n            const vec3 color1 = vec3(1.55, 0.65, 2.25);           // Первый цвет\n            const vec3 color2 = vec3(0.55, 0.75, 1.225);           // Второй цвет\n            const vec3 color3 = vec3(0.85, 0.25, 1.425);           // Третий цвет\n            const float timeMultiplier = 0.4;  // Множитель времени\n            const float distanceOffset = 0.078;  // Смещение расстояния\n            \n            \n            const float nebulaIntensity = 0.5; // Интенсивность туманности\n            const vec3 nebulaColor1 = vec3(0.2, 0.0, 0.5);     // Первый цвет туманности\n            const vec3 nebulaColor2 = vec3(0.8, 0.2, 1.0);     // Второй цвет туманности\n            const float nebulaSpeed = 0.1;     // Скорость движения туманности\n            const float nebulaScale = 1.0;     // Масштаб туманности\n            \n            // Псевдослучайная функция\n            float hash(vec2 p) {\n                return fract(sin(dot(p, vec2(127.1, 311.7))) * 43758.5453);\n            }\n            \n            // Интерполированный шум\n            float noise(vec2 p) {\n                vec2 i = floor(p);\n                vec2 f = fract(p);\n            \n                float a = hash(i);\n                float b = hash(i + vec2(1.0, 0.0));\n                float c = hash(i + vec2(0.0, 1.0));\n                float d = hash(i + vec2(1.0, 1.0));\n            \n                vec2 u = f * f * (3.0 - 2.0 * f);\n            \n                return mix(a, b, u.x) +\n                    (c - a) * u.y * (1.0 - u.x) +\n                    (d - b) * u.x * u.y;\n            }\n            \n            // Фрактальный шум\n            float fbm(vec2 p) {\n                float value = 0.0;\n                float amplitude = 0.5;\n                for (int i = 0; i < 4; i++) {\n                    value += amplitude * noise(p);\n                    p *= 2.0;\n                    amplitude *= 0.5;\n                }\n                return value;\n            }\n            \n            // Формируем лучи\n            float vDrop(vec2 uv, float t) {\n                uv.x = uv.x * numBeams;\n                float dx = fract(uv.x);\n                uv.x = floor(uv.x);\n                uv.y *= tunnelStretch;\n                float o = sin(uv.x * offsetFreq);\n                float s = cos(uv.x * speedFreq) * 0.3 + 0.2;\n                float trail = mix(trailStart, trailEnd, s);\n                float yv = fract(uv.y + t * s + o) * trail;\n                yv = 1.0 / yv;\n                yv = smoothstep(0.0, 1.0, yv * yv);\n                yv = sin(yv * PI) * (s * amplitude);\n                float d2 = sin(dx * PI);\n                return yv * (d2 * d2);\n            }\n            \n            void main() {\n                // Нормализуем координаты с учетом соотношения сторон\n                vec2 uv = (gl_FragCoord.xy / resolution.xy) * 2.0 - 1.0;\n                uv.x *= resolution.x / resolution.y; // Корректируем по соотношению сторон\n            \n                float d = length(uv) + distanceOffset;\n                vec2 uvPolar = vec2(atan(uv.x, uv.y) / PI, 2.5 / d);\n            \n                float t = time * timeMultiplier;\n                vec3 col = color1 * vDrop(uvPolar, t);\n                col += color2 * vDrop(uvPolar, t + 0.33);\n                col += color3 * vDrop(uvPolar, t + 0.66);\n            \n                col *= d * d;\n            \n                // Вычисление координат для туманности\n                vec2 nebulaUV = uv * nebulaScale + vec2(0.0, t * nebulaSpeed);\n            \n                float nebulaValue = fbm(nebulaUV) * nebulaIntensity;\n                vec3 nebulaColor = mix(nebulaColor1, nebulaColor2, nebulaValue);\n            \n                col += nebulaColor * nebulaValue;\n            \n                gl_FragColor = vec4(col, 1.0);\n            }\n        ");
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iA);
        GLES20.glAttachShader(iGlCreateProgram, iA2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(iGlCreateProgram);
            GLES20.glDeleteProgram(iGlCreateProgram);
            throw new RuntimeException(wg0.i("Error linking program: ", strGlGetProgramInfoLog));
        }
        this.a = iGlCreateProgram;
        GLES20.glUseProgram(iGlCreateProgram);
        this.b = GLES20.glGetUniformLocation(this.a, "time");
        this.c = GLES20.glGetUniformLocation(this.a, "resolution");
        this.o = GLES20.glGetAttribLocation(this.a, "vPosition");
    }
}
