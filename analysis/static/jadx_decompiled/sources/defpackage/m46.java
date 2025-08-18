package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* loaded from: classes2.dex */
public final class m46 implements sj3 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ FrgAttachVideo b;

    public m46(FrgAttachVideo frgAttachVideo, HashMap map) {
        this.b = frgAttachVideo;
        this.a = map;
    }

    @Override // defpackage.sj3
    public final void accept(Object obj) {
        int iIntValue;
        mqb mqbVar = (mqb) obj;
        hm9.m("ru.ok.messages.media.attaches.fragments.FrgAttachVideo", "onQualitySelected %s", mqbVar);
        for (Map.Entry entry : this.a.entrySet()) {
            if (((nqb) entry.getValue()).a == mqbVar) {
                mze mzeVar = (mze) entry.getKey();
                lj9 lj9Var = this.b.N1;
                if (lj9Var != null) {
                    hm9.m("lj9", "selectTrackContainer %s", mzeVar);
                    if (lj9Var.b2()) {
                        bq7 bq7Var = (bq7) lj9Var.c;
                        if (bq7Var.f != null) {
                            u65 u65Var = bq7Var.b;
                            u65Var.getClass();
                            hm9.m("u65", "selectTrackContainer: %s", mzeVar);
                            u65.u();
                            kad kadVar = u65Var.b;
                            kadVar.getClass();
                            ((t33) kadVar.X).k(mzeVar.a.X, "app.video.play.quality");
                            if (mzeVar == mze.c) {
                                bf4 bf4Var = (bf4) kadVar.a;
                                ez7 ez7Var = bf4Var.c;
                                if (ez7Var != null && (iIntValue = ((Integer) kadVar.d(ez7Var).first).intValue()) >= 0) {
                                    pe4 pe4VarB = bf4Var.b();
                                    SparseArray sparseArray = pe4VarB.M;
                                    Map map = (Map) sparseArray.get(iIntValue);
                                    if (map != null && !map.isEmpty()) {
                                        sparseArray.remove(iIntValue);
                                    }
                                    bf4Var.h(pe4VarB);
                                }
                            } else {
                                kadVar.h(mzeVar.a.X);
                            }
                        }
                        ef7 ef7Var = lj9Var.Y;
                        if (ef7Var.get() != null) {
                            ((ad) ef7Var.get()).d(mzeVar.a.X, "VIDEO_QUALITY_SELECTED");
                        }
                    }
                }
            }
        }
    }
}
