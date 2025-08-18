package defpackage;

import android.content.DialogInterface;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import ru.ok.messages.settings.caching.FrgCachingSettings;
import ru.ok.messages.views.dialogs.FrgDlgStopLiveLocation;
import ru.ok.messages.views.dialogs.VideoCompressionModeDialog;
import ru.ok.messages.views.dialogs.VideoQualityPickerDialog;
import ru.ok.messages.views.fragments.base.FrgBase;

/* loaded from: classes2.dex */
public final /* synthetic */ class p46 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p46(a aVar, Object obj, int i) {
        this.a = i;
        this.b = aVar;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2;
        final int i3 = 0;
        int i4 = 3;
        final int i5 = 1;
        switch (this.a) {
            case 0:
                FrgCachingSettings frgCachingSettings = (FrgCachingSettings) this.b;
                frgCachingSettings.getClass();
                int progress = ((ood) this.c).getProgress();
                jp jpVar = frgCachingSettings.E1;
                if (progress == 0) {
                    jpVar.l("app.media.caching.limit", 536870912L);
                } else if (progress == 1) {
                    jpVar.l("app.media.caching.limit", 1073741824L);
                } else if (progress == 2) {
                    jpVar.l("app.media.caching.limit", 2147483648L);
                } else if (progress == 3) {
                    jpVar.l("app.media.caching.limit", 4294967296L);
                } else if (progress == 4) {
                    jpVar.l("app.media.caching.limit", -1L);
                }
                frgCachingSettings.v1();
                return;
            case 1:
                FrgCachingSettings frgCachingSettings2 = (FrgCachingSettings) this.b;
                frgCachingSettings2.getClass();
                CharSequence charSequence = ((CharSequence[]) this.c)[i];
                boolean zEquals = charSequence.equals(frgCachingSettings2.h0(jpc.S0));
                jp jpVar2 = frgCachingSettings2.E1;
                if (zEquals) {
                    jpVar2.k(0, "app.media.caching.time");
                } else if (charSequence.equals(frgCachingSettings2.h0(jpc.U0))) {
                    jpVar2.k(1, "app.media.caching.time");
                } else if (charSequence.equals(frgCachingSettings2.h0(jpc.T0))) {
                    jpVar2.k(2, "app.media.caching.time");
                } else if (charSequence.equals(frgCachingSettings2.h0(jpc.V0))) {
                    jpVar2.k(3, "app.media.caching.time");
                }
                frgCachingSettings2.v1();
                return;
            case 2:
                FrgCachingSettings frgCachingSettings3 = (FrgCachingSettings) this.b;
                List<iw0> list = (List) this.c;
                frgCachingSettings3.getClass();
                final HashSet hashSet = new HashSet();
                for (iw0 iw0Var : list) {
                    if (iw0Var.d) {
                        hashSet.add(iw0Var.b);
                    }
                }
                final cx0 cx0Var = frgCachingSettings3.H1;
                synchronized (cx0Var) {
                    if (cx0Var.k == null) {
                        hm9.p("cx0", "onClearCacheTypesPicked: invalid state no cacheData", null);
                        ((FrgBase) cx0Var.h).j1();
                        cx0Var.h.J();
                        return;
                    } else {
                        cx0Var.h.F();
                        r0a r0aVarN = new q28(new ib3(new sa3(1, new f6() { // from class: zw0
                            @Override // defpackage.f6
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        cx0 cx0Var2 = cx0Var;
                                        Collection collection = hashSet;
                                        cx0Var2.getClass();
                                        if (collection.contains(gx0.t0)) {
                                            gx0 gx0Var = gx0.Y;
                                            if (!collection.contains(gx0Var)) {
                                                collection.add(gx0Var);
                                            }
                                        }
                                        if (cx0Var2.k.a == null) {
                                            hm9.p("cx0", "onClearCacheTypesPicked: already cleared all", null);
                                            break;
                                        } else {
                                            ax0 ax0Var = cx0Var2.k;
                                            if (collection.contains(gx0.Z) || collection.contains(gx0.c)) {
                                                f40 f40Var = cx0Var2.b;
                                                f40Var.getClass();
                                                hm9.n("f40", "stop");
                                                f40Var.t();
                                                f40Var.c.t();
                                                f40Var.o();
                                            }
                                            ax0Var.a.h(collection);
                                            cx0Var2.c.a(new f8d((HashSet) collection));
                                            break;
                                        }
                                        break;
                                    default:
                                        cx0 cx0Var3 = cx0Var;
                                        cx0Var3.getClass();
                                        if (hashSet.equals(cx0.l)) {
                                            cx0Var3.i.set(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }).f(new f6() { // from class: zw0
                            @Override // defpackage.f6
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        cx0 cx0Var2 = cx0Var;
                                        Collection collection = hashSet;
                                        cx0Var2.getClass();
                                        if (collection.contains(gx0.t0)) {
                                            gx0 gx0Var = gx0.Y;
                                            if (!collection.contains(gx0Var)) {
                                                collection.add(gx0Var);
                                            }
                                        }
                                        if (cx0Var2.k.a == null) {
                                            hm9.p("cx0", "onClearCacheTypesPicked: already cleared all", null);
                                            break;
                                        } else {
                                            ax0 ax0Var = cx0Var2.k;
                                            if (collection.contains(gx0.Z) || collection.contains(gx0.c)) {
                                                f40 f40Var = cx0Var2.b;
                                                f40Var.getClass();
                                                hm9.n("f40", "stop");
                                                f40Var.t();
                                                f40Var.c.t();
                                                f40Var.o();
                                            }
                                            ax0Var.a.h(collection);
                                            cx0Var2.c.a(new f8d((HashSet) collection));
                                            break;
                                        }
                                        break;
                                    default:
                                        cx0 cx0Var3 = cx0Var;
                                        cx0Var3.getClass();
                                        if (hashSet.equals(cx0.l)) {
                                            cx0Var3.i.set(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }), i3, "cx0"), new yw0(cx0Var, i5), i4).r(cx0Var.f).n(cx0Var.g);
                        sd7 sd7Var = new sd7(new yw0(cx0Var, i2), new yw0(cx0Var, i4), ft.d);
                        r0aVarN.a(sd7Var);
                        cx0Var.a(sd7Var);
                        return;
                    }
                }
            case 3:
                FrgDlgStopLiveLocation frgDlgStopLiveLocation = (FrgDlgStopLiveLocation) this.b;
                frgDlgStopLiveLocation.getClass();
                long j = ((e52) this.c).a;
                a aVar = frgDlgStopLiveLocation.I0;
                ((x46) (aVar != null ? x46.class.cast(aVar) : x46.class.cast(frgDlgStopLiveLocation.b0()))).t(j);
                return;
            case 4:
                aef aefVar = new aef(((xdf[]) this.c)[i]);
                hm9.n("ru.ok.messages.views.dialogs.VideoCompressionModeDialog", "set fragment result " + aefVar);
                ((VideoCompressionModeDialog) this.b).f0().e0("VideoCompressionModeDialog:result:request", dy7.g(new kpa("VideoCompressionModeDialog:result:key", aefVar)));
                return;
            default:
                ((VideoQualityPickerDialog) this.b).o1(new nkf(((qqb) ((ArrayList) this.c).get(i)).a.a));
                return;
        }
    }
}
