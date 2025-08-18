package one.me.sdk.gl.effects.objects;

import androidx.annotation.Keep;
import defpackage.hm9;
import defpackage.ir6;
import defpackage.jcg;
import defpackage.pcg;
import defpackage.us7;
import defpackage.ybg;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lone/me/sdk/gl/effects/objects/OesToImage2dRenderer;", "", "<init>", "()V", "Le5f;", "release", "", "oesTexName", "", "textMatrix", jcg.VERTEX_SHADER_UNI_MVP_MATRIX, "render", "(I[F[F)V", "", "tag", "Ljava/lang/String;", "Lpcg;", "program", "Lpcg;", "Lybg;", "frame", "Lybg;", "gl-effects_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class OesToImage2dRenderer {
    private final ybg frame;
    private final pcg program;
    private final String tag;

    public OesToImage2dRenderer() {
        String name = OesToImage2dRenderer.class.getName();
        this.tag = name;
        pcg pcgVar = new pcg("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
        this.program = pcgVar;
        this.frame = new ybg(pcgVar.getVertexCoordLoc(), pcgVar.getTextureCoordLoc());
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "init", null);
        }
    }

    public static /* synthetic */ void render$default(OesToImage2dRenderer oesToImage2dRenderer, int i, float[] fArr, float[] fArr2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fArr = null;
        }
        if ((i2 & 4) != 0) {
            fArr2 = null;
        }
        oesToImage2dRenderer.render(i, fArr, fArr2);
    }

    public final void release() {
        hm9.m0(this.tag, "release", new Object[0]);
        this.frame.a.b();
        this.program.release();
    }

    public final void render(int oesTexName, float[] textMatrix, float[] mvpMatrix) {
        this.program.setTextureId(oesTexName);
        this.program.setTexMat(textMatrix);
        this.program.setMVPMat(mvpMatrix);
        this.program.use();
        this.frame.a.a();
        this.program.unUse();
    }
}
