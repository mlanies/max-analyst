package defpackage;

import com.google.firebase.datatransport.TransportRegistrar;
import java.io.File;
import java.util.List;
import org.apache.http.util.LangUtils;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class n2f implements cc3, qa5, ra5, qj3, b7b, b66 {
    public final /* synthetic */ int a;

    public /* synthetic */ n2f(int i) {
        this.a = i;
    }

    @Override // defpackage.qa5
    public ka5[] a() {
        switch (this.a) {
            case 2:
                return new ka5[]{new h3f()};
            default:
                return new ka5[]{new zrf()};
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        d20 d20Var = d20.o;
        switch (this.a) {
            case 4:
                hm9.p("c7f", "clear: failed to clear uploads repository", (Throwable) obj);
                break;
            case 5:
                hm9.m("c7f", "getUploadFromRepository: found upload in cache, upload=%s", (v6f) obj);
                break;
            case 6:
                hm9.p("c7f", "getUploadFromRepository: failed to get upload from cache", (Throwable) obj);
                break;
            case 8:
                ((j10) obj).i = d20Var;
                break;
            case 16:
                hm9.p("wef", "clear: failed", (Throwable) obj);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                hm9.m("wef", "convertObs: progress %f", (Float) obj);
                break;
            case 18:
                hm9.m("wef", "convertVideo: loaded from storage = %s", (kef) obj);
                break;
            case 22:
                j10 j10Var = (j10) obj;
                if (j10Var.c().g || !oag.t(j10Var.c().h)) {
                    d20Var = d20.a;
                }
                j10Var.i = d20Var;
                break;
            default:
                int i = VideoPlayerSeekBarPreview.E0;
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 10:
                ((e52) obj).b.f0.getClass();
                return nz4.a;
            case 11:
                return new File((String) obj);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                w8f w8fVar = (w8f) obj;
                w8fVar.getClass();
                return new sa3(2, new ia4(14, w8fVar));
            case 13:
                return xfg.u((e7f) obj);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                List list = (List) obj;
                return list.isEmpty() ? m28.a : f28.e(list);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return ((OneMeRoomDatabase) obj).U();
            case 16:
            case LangUtils.HASH_SEED /* 17 */:
            case 18:
            default:
                return ((pk0) obj).a();
            case 19:
                qef qefVar = (qef) obj;
                qefVar.getClass();
                return new sa3(2, new ia4(15, qefVar));
            case 20:
                nef nefVar = (nef) obj;
                lef lefVar = null;
                if (nefVar == null) {
                    return null;
                }
                w36 w36Var = new w36();
                mef mefVar = nefVar.a;
                if (mefVar != null) {
                    i20 i20Var = new i20(1);
                    i20Var.a = mefVar.b;
                    i20Var.b = mefVar.c;
                    i20Var.c = mefVar.d;
                    i20Var.d = mefVar.e;
                    ref refVar = new ref(i20Var);
                    l7b l7bVar = new l7b(13, false);
                    l7bVar.b = mefVar.a;
                    l7bVar.c = refVar;
                    lefVar = new lef(l7bVar);
                }
                w36Var.b = lefVar;
                w36Var.c = nefVar.c;
                w36Var.o = nefVar.d;
                w36Var.a = nefVar.b;
                return new kef(w36Var);
            case 21:
                return ((OneMeRoomDatabase) obj).V();
        }
    }

    @Override // defpackage.cc3
    public Object f(bg4 bg4Var) {
        switch (this.a) {
            case 0:
                return TransportRegistrar.lambda$getComponents$1(bg4Var);
            default:
                return TransportRegistrar.lambda$getComponents$2(bg4Var);
        }
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        switch (this.a) {
            case 7:
                return ((v6f) obj).a();
            default:
                return ((e52) obj).b.f0 != null;
        }
    }

    @Override // defpackage.ra5
    /* renamed from: a */
    public la5[] mo8a() {
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 3:
                kj6 kj6Var = mbe.a0;
                tue tueVar = new tue(0L);
                ls5 ls5Var = zw6.b;
                return new la5[]{new i3f(1, 1, kj6Var, tueVar, new df4(ffc.X, i, i2))};
            default:
                return new la5[]{new asf()};
        }
    }
}
