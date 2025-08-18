package defpackage;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory;

/* loaded from: classes.dex */
public final class zc3 implements t8b {
    public final zff a;

    public zc3(yc3 yc3Var) {
        this.a = yc3Var;
    }

    @Override // defpackage.t8b
    public final s8b a(Context context, i63 i63Var, pgf pgfVar, wc3 wc3Var, ffc ffcVar) throws VideoFrameProcessingException {
        try {
            return ((t8b) PreviewingSingleInputVideoGraph$Factory.class.getConstructor(zff.class).newInstance(this.a)).a(context, i63Var, pgfVar, wc3Var, ffcVar);
        } catch (Exception e) {
            throw VideoFrameProcessingException.a(e);
        }
    }
}
