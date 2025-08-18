package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class sqb implements e15 {
    public static final HashMap o;
    public final e15 a;
    public final yw1 b;
    public final bj6 c;

    static {
        HashMap map = new HashMap();
        o = map;
        map.put(1, mb0.i);
        map.put(8, mb0.g);
        map.put(6, mb0.f);
        map.put(5, mb0.e);
        map.put(4, mb0.d);
        map.put(0, mb0.h);
    }

    public sqb(yw1 yw1Var, e15 e15Var, bj6 bj6Var) {
        this.a = e15Var;
        this.b = yw1Var;
        this.c = bj6Var;
    }

    @Override // defpackage.e15
    public final boolean m(int i) {
        if (this.a.m(i)) {
            mb0 mb0Var = (mb0) o.get(Integer.valueOf(i));
            if (mb0Var != null) {
                Iterator it = this.c.f(VideoQualityQuirk.class).iterator();
                while (it.hasNext()) {
                    VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
                    if (videoQualityQuirk == null || !videoQualityQuirk.a(this.b, mb0Var) || ((videoQualityQuirk instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) videoQualityQuirk).b())) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.e15
    public final f15 n(int i) {
        if (m(i)) {
            return this.a.n(i);
        }
        return null;
    }
}
