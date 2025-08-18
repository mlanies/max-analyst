package one.me.sdk.gl.effects.objects;

import android.content.Context;
import androidx.annotation.Keep;
import defpackage.lbg;
import defpackage.zr6;

@Keep
/* loaded from: classes2.dex */
public final class TrivialFragmentShader extends lbg {
    public TrivialFragmentShader(int i, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "#extension GL_OES_EGL_image_external : require\n" : "");
        sb.append("precision mediump float;\nvarying vec2 vTextureCoord;\nuniform ");
        super(zr6.l(sb, z ? "samplerExternalOES" : "sampler2D", " sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"), i);
    }

    @Override // defpackage.lbg
    public /* bridge */ /* synthetic */ String getSource() {
        return super.getSource();
    }

    @Override // defpackage.jcg
    public /* bridge */ /* synthetic */ int getTextureCoordLoc() {
        return super.getTextureCoordLoc();
    }

    @Override // defpackage.jcg
    public /* bridge */ /* synthetic */ int getVertexCoordLoc() {
        return super.getVertexCoordLoc();
    }

    public /* bridge */ /* synthetic */ void initPart(int i) {
    }

    public /* bridge */ /* synthetic */ void prepareTextures(Context context) {
    }

    @Override // defpackage.jcg
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // defpackage.jcg
    public /* bridge */ /* synthetic */ void render() {
        super.render();
    }

    @Override // defpackage.jcg
    public /* bridge */ /* synthetic */ void setCustomParameter(String str, float f) {
        super.setCustomParameter(str, f);
    }

    @Override // defpackage.jcg
    public /* bridge */ /* synthetic */ void setMVPMat(float[] fArr) {
        super.setMVPMat(fArr);
    }

    @Override // defpackage.jcg
    public /* bridge */ /* synthetic */ void setTexMat(float[] fArr) {
        super.setTexMat(fArr);
    }

    @Override // defpackage.jcg
    public /* bridge */ /* synthetic */ void setTextureAlpha(float f) {
        super.setTextureAlpha(f);
    }

    @Override // defpackage.jcg
    public /* bridge */ /* synthetic */ void setTextureId(int i) {
        super.setTextureId(i);
    }

    @Override // defpackage.jcg
    public /* bridge */ /* synthetic */ void unUse() {
        super.unUse();
    }

    @Override // defpackage.jcg
    public /* bridge */ /* synthetic */ void use() {
        super.use();
    }

    public /* bridge */ /* synthetic */ void usePart() {
    }

    @Override // defpackage.jcg
    public /* bridge */ /* synthetic */ void setCustomParameter(String str, int i) {
        super.setCustomParameter(str, i);
    }
}
