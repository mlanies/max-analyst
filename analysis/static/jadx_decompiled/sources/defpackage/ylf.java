package defpackage;

import android.content.Context;
import android.view.TextureView;

/* loaded from: classes2.dex */
public final class ylf extends TextureView {
    public final /* synthetic */ amf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylf(amf amfVar, Context context) {
        super(context);
        this.a = amfVar;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tlf tlfVar = this.a.s0;
        if (tlfVar != null) {
            tlfVar.onSurfaceTextureDestroyed(getSurfaceTexture());
        }
    }
}
