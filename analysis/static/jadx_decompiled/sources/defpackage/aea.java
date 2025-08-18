package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class aea implements op0 {
    public final je7 a;

    public aea(je7 je7Var) {
        this.a = je7Var;
    }

    public RenderNode a() {
        return (RenderNode) this.a.getValue();
    }

    @Override // defpackage.op0
    public void b() {
        a().discardDisplayList();
    }

    @Override // defpackage.op0
    public void c(Canvas canvas, Bitmap bitmap) {
        canvas.drawRenderNode(a());
    }

    @Override // defpackage.op0
    public void d(Bitmap bitmap, float f) {
        a().setPosition(0, 0, bitmap.getWidth(), bitmap.getHeight());
        a().beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        a().endRecording();
        a().setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR));
    }

    @Override // defpackage.op0
    public void p(int i) {
        a().setAlpha(i / 255.0f);
    }

    public aea(int i) {
        switch (i) {
            case 2:
                this.a = wjd.a.getAccessor().d(af8.class);
                break;
            default:
                this.a = tu0.r(2, new hbc(4));
                break;
        }
    }
}
