package defpackage;

import java.io.File;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.messages.media.attaches.AttachPhotoView;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.stickers.favorite.FavoriteStickersController$FavoriteStickerControllerException;
import ru.ok.tamtam.stickersets.favorite.FavoriteStickerSetController$FavoriteStickerSetsControllerException;

/* loaded from: classes2.dex */
public final /* synthetic */ class p00 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p00(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        List listP;
        pa3 qa3Var;
        final int i = 1;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        char c5 = 1;
        char c6 = 1;
        int i2 = 2;
        lr9 lr9Var = (lr9) ((s7d) ((wle) this.b).i.getValue()).k.getValue();
        lr9Var.getClass();
        mr9 mr9Var = (mr9) this.c;
        int i3 = mr9Var.X;
        if (i3 == 5) {
            hm9.n("lr9", "Handle FAVORITE_STICKER_SET update");
            lr9Var.a(mr9Var);
            final sc5 sc5Var = (sc5) lr9Var.a.get();
            final long j = mr9Var.c;
            final List listSingletonList = mr9Var.o;
            yt ytVar = mr9Var.Y;
            final int i4 = mr9Var.Z;
            sc5Var.getClass();
            hm9.m("sc5", "onNotifAssetsUpdate: id=%d, updateType=%s, position=%d", Long.valueOf(j), ytVar.a, Integer.valueOf(i4));
            int iOrdinal = ytVar.ordinal();
            je7 je7Var = sc5Var.o;
            hc3 hc3Var = sc5Var.t0;
            if (iOrdinal == 1) {
                za3 za3VarK = new qa3(sc5Var.b(), i2, new c10(j, 14)).k((ztc) je7Var.getValue());
                mc5 mc5Var = new mc5(j, 0);
                final char c7 = c5 == true ? 1 : 0;
                iq1 iq1Var = new iq1(new qj3() { // from class: lc5
                    @Override // defpackage.qj3
                    public final void accept(Object obj) {
                        long j2 = j;
                        sc5 sc5Var2 = sc5Var;
                        int i5 = c7;
                        Throwable th = (Throwable) obj;
                        sc5Var2.getClass();
                        switch (i5) {
                            case 0:
                                Locale locale = Locale.ENGLISH;
                                hm9.p("sc5", "onNotifUpdated: failed for id: " + j2, th);
                                sc5Var2.f();
                                break;
                            default:
                                Locale locale2 = Locale.ENGLISH;
                                hm9.p("sc5", zr6.k(new StringBuilder("onNotifAdded: failed to add sticker set "), j2, " to cache"), th);
                                sc5Var2.f();
                                break;
                        }
                    }
                }, 0, mc5Var);
                za3VarK.i(iq1Var);
                hc3Var.a(iq1Var);
                return;
            }
            if (iOrdinal == 2) {
                if (nd7.D(listSingletonList)) {
                    listSingletonList = Collections.singletonList(Long.valueOf(j));
                }
                za3 za3VarK2 = new qa3(sc5Var.b(), i2, new z72(10, listSingletonList)).k((ztc) je7Var.getValue());
                final int i5 = 0;
                iq1 iq1Var2 = new iq1(new qj3() { // from class: jc5
                    @Override // defpackage.qj3
                    public final void accept(Object obj) {
                        List list = listSingletonList;
                        sc5 sc5Var2 = sc5Var;
                        int i6 = i5;
                        Throwable th = (Throwable) obj;
                        sc5Var2.getClass();
                        switch (i6) {
                            case 0:
                                hm9.p("sc5", String.format(Locale.ENGLISH, "onNotifRemoved: failed to remove sticker sets %s from cache", list), th);
                                sc5Var2.f();
                                break;
                            default:
                                hm9.p("sc5", String.format(Locale.ENGLISH, "onListUpdated: failed to store sticker sets=%s", list), th);
                                sc5Var2.f();
                                break;
                        }
                    }
                }, 0, new ic5(0, listSingletonList));
                za3VarK2.i(iq1Var2);
                hc3Var.a(iq1Var2);
                return;
            }
            if (iOrdinal == 3) {
                za3 za3VarK3 = new qa3(sc5Var.b(), i2, new fc5(i4, c6 == true ? 1 : 0, j)).k((ztc) je7Var.getValue());
                final int i6 = 0;
                iq1 iq1Var3 = new iq1(new e74(sc5Var, j, i4, 1), 0, new f6() { // from class: rc5
                    @Override // defpackage.f6
                    public final void run() {
                        int i7 = i4;
                        long j2 = j;
                        switch (i6) {
                            case 0:
                                hm9.m("sc5", "onNotifMoved: success move id=%d to position=%d", Long.valueOf(j2), Integer.valueOf(i7));
                                break;
                            default:
                                hm9.m("md5", "onNotifMoved: success move id=%d to position=%d", Long.valueOf(j2), Integer.valueOf(i7));
                                break;
                        }
                    }
                });
                za3VarK3.i(iq1Var3);
                hc3Var.a(iq1Var3);
                return;
            }
            if (iOrdinal == 4) {
                hm9.m("sc5", "onNotifUpdated: id=%d", Long.valueOf(j));
                final int i7 = 0;
                drd drdVarM = new ib3(new uqd(sc5Var.b(), new ta4(26), 0), new sa3(3, ((a4e) sc5Var.b.getValue()).d(Collections.singletonList(Long.valueOf(j))))).m((ztc) je7Var.getValue());
                iq1 iq1Var4 = new iq1(new kc5(sc5Var, i7), 2, new qj3() { // from class: lc5
                    @Override // defpackage.qj3
                    public final void accept(Object obj) {
                        long j2 = j;
                        sc5 sc5Var2 = sc5Var;
                        int i52 = i7;
                        Throwable th = (Throwable) obj;
                        sc5Var2.getClass();
                        switch (i52) {
                            case 0:
                                Locale locale = Locale.ENGLISH;
                                hm9.p("sc5", "onNotifUpdated: failed for id: " + j2, th);
                                sc5Var2.f();
                                break;
                            default:
                                Locale locale2 = Locale.ENGLISH;
                                hm9.p("sc5", zr6.k(new StringBuilder("onNotifAdded: failed to add sticker set "), j2, " to cache"), th);
                                sc5Var2.f();
                                break;
                        }
                    }
                });
                drdVarM.k(iq1Var4);
                hc3Var.a(iq1Var4);
                return;
            }
            if (iOrdinal != 5) {
                hm9.p("sc5", "onNotifAssetsUpdate: unknown asset type", null);
                return;
            }
            hm9.m("sc5", "onListUpdated: ids=%s", listSingletonList);
            za3 za3VarK4 = new qa3(sc5Var.b(), i2, new z72(11, listSingletonList)).k((ztc) sc5Var.c.getValue());
            iq1 iq1Var5 = new iq1(new qj3() { // from class: jc5
                @Override // defpackage.qj3
                public final void accept(Object obj) {
                    List list = listSingletonList;
                    sc5 sc5Var2 = sc5Var;
                    int i62 = i;
                    Throwable th = (Throwable) obj;
                    sc5Var2.getClass();
                    switch (i62) {
                        case 0:
                            hm9.p("sc5", String.format(Locale.ENGLISH, "onNotifRemoved: failed to remove sticker sets %s from cache", list), th);
                            sc5Var2.f();
                            break;
                        default:
                            hm9.p("sc5", String.format(Locale.ENGLISH, "onListUpdated: failed to store sticker sets=%s", list), th);
                            sc5Var2.f();
                            break;
                    }
                }
            }, 0, new ic5(1, listSingletonList));
            za3VarK4.i(iq1Var5);
            hc3Var.a(iq1Var5);
            return;
        }
        if (i3 != 4) {
            if (i3 == 3) {
                hm9.n("lr9", "Handle STICKER_SET update");
                if (mr9Var.Y == yt.UPDATED) {
                    ((pk) lr9Var.d.get()).c(3, Collections.singletonList(Long.valueOf(mr9Var.c)));
                    return;
                }
                Locale locale = Locale.ENGLISH;
                hm9.p("lr9", "Unhandled sticker set update type: " + mr9Var, null);
                return;
            }
            if (i3 != 6) {
                Locale locale2 = Locale.ENGLISH;
                hm9.p("lr9", "Unhandled notif assets update: " + mr9Var, null);
                return;
            }
            hm9.n("lr9", "Handle RECENT update");
            x9c x9cVar = (x9c) lr9Var.e.get();
            ArrayList arrayList = mr9Var.t0;
            List list = mr9Var.u0;
            yt ytVar2 = mr9Var.Y;
            List listK = nz4.a;
            if (arrayList == null) {
                x9cVar.getClass();
                listP = listK;
            } else {
                listP = iz7.p(arrayList, (vxc) x9cVar.e.getValue());
            }
            if (list != null) {
                listK = iz7.k(list);
            }
            ArrayList arrayList2 = new ArrayList(listP);
            arrayList2.addAll(listK);
            if (arrayList2.isEmpty()) {
                return;
            }
            Collections.reverse(arrayList2);
            int iOrdinal2 = ytVar2.ordinal();
            msf msfVar = x9cVar.f;
            je7 je7Var2 = x9cVar.c;
            if (iOrdinal2 == 1) {
                p9c p9cVarB = x9cVar.b();
                za3 za3VarK5 = new qa3(p9cVarB.a.n(), i2, new o9c(p9cVarB, arrayList2, 2)).k((ztc) je7Var2.getValue());
                iq1 iq1Var6 = new iq1(huc.t0, 0, new fa4(5));
                za3VarK5.i(iq1Var6);
                msfVar.a(iq1Var6);
                return;
            }
            if (iOrdinal2 != 2) {
                hm9.q("x9c", "Unhandled notif assets update: %s", ytVar2);
                return;
            }
            if (listP.isEmpty()) {
                qa3Var = wa3.a;
            } else {
                int i8 = 0;
                qa3Var = new qa3(x9cVar.b().c(listP), i8, new sa3(1, new u9c(x9cVar, listP, i8)));
            }
            za3 za3VarK6 = qa3Var.k((ztc) je7Var2.getValue());
            iq1 iq1Var7 = new iq1(crd.t0, 0, new fa4(6));
            za3VarK6.i(iq1Var7);
            msfVar.a(iq1Var7);
            return;
        }
        hm9.n("lr9", "Handle FAVORITE_STICKER update");
        lr9Var.a(mr9Var);
        final md5 md5Var = (md5) lr9Var.b.get();
        final long j2 = mr9Var.c;
        final List listSingletonList2 = mr9Var.o;
        yt ytVar3 = mr9Var.Y;
        final int i9 = mr9Var.Z;
        md5Var.getClass();
        hm9.m("md5", "onNotifAssetsUpdate: id=%d, ids=%s, updateType=%s, position=%d", Long.valueOf(j2), listSingletonList2, ytVar3.a, Integer.valueOf(i9));
        int iOrdinal3 = ytVar3.ordinal();
        hc3 hc3Var2 = md5Var.h;
        rm4 rm4Var = md5Var.c;
        rm4 rm4Var2 = md5Var.a;
        if (iOrdinal3 == 1) {
            final int i10 = 0;
            za3 za3VarK7 = new qa3(((hc5) rm4Var2.get()).a(), i2, new bc5(i10, j2, c == true ? 1 : 0)).k((ztc) rm4Var.get());
            iq1 iq1Var8 = new iq1(new qj3() { // from class: jd5
                @Override // defpackage.qj3
                public final void accept(Object obj) {
                    long j3 = j2;
                    md5 md5Var2 = md5Var;
                    int i11 = i10;
                    Throwable th = (Throwable) obj;
                    md5Var2.getClass();
                    switch (i11) {
                        case 0:
                            Locale locale3 = Locale.ENGLISH;
                            hm9.p("md5", zr6.k(new StringBuilder("onNotifAdded: failed to add sticker "), j3, " to cache"), th);
                            md5Var2.c();
                            break;
                        default:
                            Locale locale4 = Locale.ENGLISH;
                            hm9.p("md5", "onNotifUpdated: failed for id: " + j3, th);
                            md5Var2.c();
                            break;
                    }
                }
            }, 0, new mc5(j2, 4));
            za3VarK7.i(iq1Var8);
            hc3Var2.a(iq1Var8);
            return;
        }
        if (iOrdinal3 == 2) {
            if (nd7.D(listSingletonList2)) {
                listSingletonList2 = Collections.singletonList(Long.valueOf(j2));
            }
            za3 za3VarK8 = new qa3(((hc5) rm4Var2.get()).a(), i2, new z72(8, listSingletonList2)).k((ztc) rm4Var.get());
            final int i11 = 0;
            iq1 iq1Var9 = new iq1(new qj3() { // from class: id5
                @Override // defpackage.qj3
                public final void accept(Object obj) {
                    List list2 = listSingletonList2;
                    md5 md5Var2 = md5Var;
                    int i12 = i11;
                    Throwable th = (Throwable) obj;
                    md5Var2.getClass();
                    switch (i12) {
                        case 0:
                            hm9.p("md5", String.format(Locale.ENGLISH, "onNotifRemoved: failed to remove stickers %s from cache", list2), th);
                            md5Var2.c();
                            break;
                        default:
                            hm9.p("md5", String.format(Locale.ENGLISH, "onListUpdated: failed to store stickers %s", list2), th);
                            md5Var2.c();
                            break;
                    }
                }
            }, 0, new ic5(5, listSingletonList2));
            za3VarK8.i(iq1Var9);
            hc3Var2.a(iq1Var9);
            return;
        }
        if (iOrdinal3 == 3) {
            za3 za3VarK9 = new qa3(((hc5) rm4Var2.get()).a(), i2, new fc5(i9, 0, j2)).k((ztc) rm4Var.get());
            final char c8 = c2 == true ? 1 : 0;
            iq1 iq1Var10 = new iq1(new e74(md5Var, j2, i9, 2), 0, new f6() { // from class: rc5
                @Override // defpackage.f6
                public final void run() {
                    int i72 = i9;
                    long j22 = j2;
                    switch (c8) {
                        case 0:
                            hm9.m("sc5", "onNotifMoved: success move id=%d to position=%d", Long.valueOf(j22), Integer.valueOf(i72));
                            break;
                        default:
                            hm9.m("md5", "onNotifMoved: success move id=%d to position=%d", Long.valueOf(j22), Integer.valueOf(i72));
                            break;
                    }
                }
            });
            za3VarK9.i(iq1Var10);
            hc3Var2.a(iq1Var10);
            return;
        }
        if (iOrdinal3 == 4) {
            hm9.m("md5", "onNotifUpdated: id=%d", Long.valueOf(j2));
            drd drdVarM2 = new ib3(new uqd(((hc5) rm4Var2.get()).a(), new ta4(24), 0), new sa3(3, new q1a(2, new yc5(md5Var, j2, 1)))).m((ztc) rm4Var.get());
            kd5 kd5Var = new kd5(md5Var, 0);
            final char c9 = c3 == true ? 1 : 0;
            iq1 iq1Var11 = new iq1(kd5Var, 2, new qj3() { // from class: jd5
                @Override // defpackage.qj3
                public final void accept(Object obj) {
                    long j3 = j2;
                    md5 md5Var2 = md5Var;
                    int i112 = c9;
                    Throwable th = (Throwable) obj;
                    md5Var2.getClass();
                    switch (i112) {
                        case 0:
                            Locale locale3 = Locale.ENGLISH;
                            hm9.p("md5", zr6.k(new StringBuilder("onNotifAdded: failed to add sticker "), j3, " to cache"), th);
                            md5Var2.c();
                            break;
                        default:
                            Locale locale4 = Locale.ENGLISH;
                            hm9.p("md5", "onNotifUpdated: failed for id: " + j3, th);
                            md5Var2.c();
                            break;
                    }
                }
            });
            drdVarM2.k(iq1Var11);
            hc3Var2.a(iq1Var11);
            return;
        }
        if (iOrdinal3 != 5) {
            hm9.p("md5", "onNotifAssetsUpdate: unknown asset type", null);
            return;
        }
        hm9.m("md5", "onListUpdated: ids=%s", listSingletonList2);
        za3 za3VarK10 = new qa3(((hc5) rm4Var2.get()).a(), i2, new z72(6, listSingletonList2)).k((ztc) rm4Var.get());
        ic5 ic5Var = new ic5(4, listSingletonList2);
        final char c10 = c4 == true ? 1 : 0;
        iq1 iq1Var12 = new iq1(new qj3() { // from class: id5
            @Override // defpackage.qj3
            public final void accept(Object obj) {
                List list2 = listSingletonList2;
                md5 md5Var2 = md5Var;
                int i12 = c10;
                Throwable th = (Throwable) obj;
                md5Var2.getClass();
                switch (i12) {
                    case 0:
                        hm9.p("md5", String.format(Locale.ENGLISH, "onNotifRemoved: failed to remove stickers %s from cache", list2), th);
                        md5Var2.c();
                        break;
                    default:
                        hm9.p("md5", String.format(Locale.ENGLISH, "onListUpdated: failed to store stickers %s", list2), th);
                        md5Var2.c();
                        break;
                }
            }
        }, 0, ic5Var);
        za3VarK10.i(iq1Var12);
        hc3Var2.a(iq1Var12);
    }

    @Override // defpackage.f6
    public final void run() throws Throwable {
        List list;
        long j;
        k20 k20Var;
        s10 s10Var;
        switch (this.a) {
            case 0:
                AttachPhotoView attachPhotoView = (AttachPhotoView) this.b;
                attachPhotoView.T0.u((ru6) this.c, attachPhotoView.L0.b.s0);
                return;
            case 1:
                ((bd4) this.b).getClass();
                mpb mpbVar = (mpb) this.c;
                hm9.m("bd4", "close socket for host: %s", mpbVar.f.toString());
                Socket socket = mpbVar.d;
                if (socket != null) {
                    try {
                        socket.close();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 2:
                ((ExternalIdsResolver) this.b).lambda$resolveIds$0((List) this.c);
                return;
            case 3:
                sc5 sc5Var = (sc5) this.b;
                sc5Var.getClass();
                long jLongValue = ((Long) this.c).longValue();
                ((qyc) ((zle) sc5Var.X.getValue()).b).getClass();
                if (jLongValue >= ((int) r0.q(PmsKey.f68maxfavoritestickersets, 100))) {
                    throw new FavoriteStickerSetController$FavoriteStickerSetsControllerException() { // from class: ru.ok.tamtam.stickersets.favorite.FavoriteStickerSetController$MaxFavoriteStickerSetsException
                    };
                }
                return;
            case 4:
                md5 md5Var = (md5) this.b;
                md5Var.getClass();
                long jLongValue2 = ((Long) this.c).longValue();
                ((qyc) ((y7d) md5Var.f.get())).getClass();
                if (jLongValue2 >= ((int) r0.q(PmsKey.f69maxfavoritestickers, 100))) {
                    throw new FavoriteStickersController$FavoriteStickerControllerException() { // from class: ru.ok.tamtam.stickers.favorite.FavoriteStickersController$MaxFavoriteStickersException
                    };
                }
                return;
            case 5:
                rs8 rs8Var = (rs8) this.b;
                rs8Var.e.O0.u((ru6) this.c, rs8Var.c.b.s0);
                return;
            case 6:
                ((k29) this.b).g.remove((e29) this.c);
                return;
            case 7:
                k9c k9cVar = (k9c) this.b;
                k9cVar.getClass();
                long jN = ((uj3) this.c).n();
                el3 el3Var = k9cVar.b;
                el3Var.getClass();
                el3Var.c(jN, new c10(0L, 11));
                return;
            case 8:
                k9c k9cVar2 = (k9c) this.b;
                k9cVar2.getClass();
                k9cVar2.a.i0(((e52) this.c).a, 0L);
                return;
            case 9:
                ((ilc) this.b).e.c((s47) this.c);
                return;
            case 10:
                s8d s8dVar = (s8d) this.b;
                s8dVar.r().d(s8dVar.b);
                au8 au8VarN = s8dVar.n();
                long j2 = s8dVar.c;
                cu8 cu8VarQ = au8VarN.q(j2);
                if (cu8VarQ != null) {
                    if (cu8VarQ.v0 == vx8.DELETED) {
                        return;
                    }
                    l20 l20VarA = cu8VarQ.a(g20.x0);
                    if (l20VarA != null) {
                        s8dVar.n().v(cu8VarQ.b, l20VarA.r, new bqc(7, (er7) this.c));
                        r9d.y(s8dVar.u());
                        s8dVar.t().c(new l6f(cu8VarQ.t0, s8dVar.c, 0));
                        return;
                    }
                    hm9.p(s8dVar.X, "onSuccess: WTF, no location attach in message", null);
                    au8 au8VarN2 = s8dVar.n();
                    au8VarN2.getClass();
                    List listSingletonList = Collections.singletonList(Long.valueOf(j2));
                    long j3 = cu8VarQ.t0;
                    au8VarN2.c(j3, listSingletonList);
                    s8dVar.t().c(new re9(j3, Collections.singletonList(Long.valueOf(j2)), null));
                    return;
                }
                return;
            case 11:
                o2e o2eVar = (o2e) this.b;
                ((k24) ((c34) o2eVar.c.get())).h.T(Collections.singletonList((d2e) this.c));
                o2eVar.f();
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((k24) ((c34) ((o2e) this.b).c.get())).h.T((List) this.c);
                return;
            case 13:
                vs9 vs9Var = (vs9) ((s7d) ((wle) this.b).i.getValue()).m.getValue();
                ((y7d) vs9Var.b.getValue()).getClass();
                ws9 ws9Var = (ws9) this.c;
                fx8 fx8Var = ws9Var.X;
                hm9.m("vs9", "reactions, onNotifYouReacted, counters Count = %s", (fx8Var == null || (list = fx8Var.a) == null) ? null : Integer.valueOf(list.size()));
                lx8 lx8Var = (lx8) vs9Var.a.getValue();
                long j4 = ws9Var.c;
                long j5 = ws9Var.o;
                LinkedHashMap linkedHashMapC = ((jx8) lx8Var.d.getValue()).c(Collections.singletonMap(Long.valueOf(j5), ws9Var.X));
                e52 e52Var = (e52) ((jz2) ((iy2) lx8Var.b.getValue())).n(j4).a.getValue();
                if (e52Var == null) {
                    return;
                }
                au8 au8VarB = lx8Var.b();
                long j6 = e52Var.a;
                cu8 cu8VarJ = au8VarB.j(j6, j5);
                if (cu8VarJ == null) {
                    return;
                }
                if (cu8VarJ.v0 == vx8.DELETED) {
                    return;
                }
                lx8Var.b().h(linkedHashMapC);
                ix8 ix8Var = (ix8) linkedHashMapC.get(Long.valueOf(j5));
                ix8 ix8Var2 = cu8VarJ.S0;
                Set setA = lx8.a(ix8Var2, ix8Var);
                boolean z = !tpa.f((ix8) linkedHashMapC.get(Long.valueOf(j5)), ix8Var2);
                hm9.m("lx8", "reactions, NOTIF_YOU_REACTED, reactionsDiff = %s", setA);
                lx8Var.d(Long.valueOf(j6), cu8VarJ, setA, z);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ps9 ps9Var = (ps9) ((s7d) ((wle) this.b).i.getValue()).n.getValue();
                ps9Var.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder("got ");
                ks9 ks9Var = (ks9) this.c;
                sb.append(ks9Var);
                hm9.n("ps9", sb.toString());
                j47.T(ps9Var.g, null, null, new ns9(jCurrentTimeMillis, ks9Var, ps9Var, null), 3);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ds9 ds9Var = (ds9) ((s7d) ((wle) this.b).i.getValue()).j.getValue();
                ds9Var.getClass();
                cs9 cs9Var = (cs9) this.c;
                fr7 fr7Var = cs9Var.X;
                er7 er7Var = fr7Var.a;
                int i = ep3.e;
                qy qyVar = new qy(er7Var);
                qyVar.b = cs9Var.c;
                qyVar.c = fr7Var.b;
                qyVar.o = cs9Var.o;
                if (((er7) qyVar.X) == null) {
                    qyVar.X = er7.Z;
                }
                new ep3(qyVar);
                bc7 bc7Var = ds9.b[0];
                ((cn7) ds9Var.a.get()).getClass();
                return;
            case 16:
                wle wleVar = (wle) this.b;
                vr9 vr9Var = (vr9) this.c;
                wleVar.getClass();
                if (vr9Var.c != null) {
                    el3 el3Var2 = (el3) wleVar.e.getValue();
                    el3Var2.getClass();
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        ir6Var.d(us7.X, "ContactController", "onNotifContact, response = " + vr9Var.c, null);
                    }
                    el3Var2.u(Collections.singletonList(vr9Var.c));
                    ((ike) el3Var2.l.get()).f(Collections.singletonList(Long.valueOf(vr9Var.c.a)));
                    ((r47) wleVar.g.getValue()).a(Collections.singletonList(Long.valueOf(vr9Var.c.a)));
                    return;
                }
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ((ur9) ((s7d) ((wle) this.b).i.getValue()).d.getValue()).b(((tr9) this.c).c, false);
                return;
            case 18:
                rs9 rs9Var = (rs9) ((s7d) ((wle) this.b).i.getValue()).h.getValue();
                rs9Var.getClass();
                StringBuilder sb2 = new StringBuilder("onNotifMsgDelete: ");
                qs9 qs9Var = (qs9) this.c;
                sb2.append(qs9Var);
                hm9.k("rs9", sb2.toString());
                f52 f52Var = qs9Var.c;
                if (f52Var == null) {
                    return;
                }
                rm4 rm4Var = rs9Var.b;
                ((p82) rm4Var.get()).c0(Collections.singletonList(f52Var));
                rs9Var.b(((p82) rm4Var.get()).z(f52Var.a), qs9Var.o, mg4.REGULAR);
                return;
            case 19:
                as9 as9Var = (as9) ((s7d) ((wle) this.b).i.getValue()).l.getValue();
                t33 t33Var = ((p7b) as9Var.a()).a;
                zr9 zr9Var = (zr9) this.c;
                t33Var.l("user.draftsLastSync", Long.valueOf(zr9Var.X));
                if (!((p7b) as9Var.a()).b.u()) {
                    hm9.n(as9.e, "onDraftDiscard: Drafts sync disabled");
                    return;
                } else {
                    bc7 bc7Var2 = as9.d[1];
                    ((rk4) as9Var.b.get()).a(zr9Var.X, Long.valueOf(zr9Var.c), Long.valueOf(zr9Var.o));
                    return;
                }
            case 20:
                sr9 sr9Var = (sr9) ((s7d) ((wle) this.b).i.getValue()).e.getValue();
                sr9Var.getClass();
                rr9 rr9Var = (rr9) this.c;
                f52 f52Var2 = rr9Var.c;
                hm9.n("sr9", "onNotifChat, chat = " + f52Var2 + " created  = " + nu0.G(Long.valueOf(f52Var2.X)));
                try {
                    ((xb9) sr9Var.e.get()).k(f52Var2);
                } catch (TamErrorException unused2) {
                }
                rm4 rm4Var2 = sr9Var.a;
                e52 e52VarZ = ((p82) rm4Var2.get()).z(f52Var2.a);
                long j7 = f52Var2.X;
                if (e52VarZ != null && j7 > 0) {
                    k92 k92Var = e52VarZ.b;
                    if (j7 < k92Var.f) {
                        hm9.p("sr9", zr6.k(au1.k(j7, "New chat created ", " < old chat created "), k92Var.f, ". Ignore this notif chat"), null);
                        return;
                    }
                }
                if (e52VarZ != null && rr9Var.c.b.equals("REMOVED")) {
                    ((p82) rm4Var2.get()).c0(Collections.singletonList(f52Var2));
                }
                int i2 = f52Var2.w0;
                if (e52VarZ != null && e52VarZ.b.f + 1 <= j7 && f52Var2.t0 == null && i2 == 0 && !rr9Var.c.b.equals("REMOVED")) {
                    ((p82) rm4Var2.get()).o(e52VarZ.a, rr9Var.c.v0);
                    return;
                }
                boolean z2 = (e52VarZ == null || j7 == e52VarZ.b.f) ? false : true;
                gi9 gi9VarC0 = ((p82) rm4Var2.get()).c0(Collections.singletonList(f52Var2));
                if (!gi9VarC0.i() && z2 && j7 > 0) {
                    ((u23) sr9Var.d.get()).a(gi9VarC0.g(), j7);
                }
                if (i2 > 0 && !gi9VarC0.i()) {
                    ((cea) sr9Var.b.get()).d(gi9VarC0.g());
                }
                ta2 ta2Var = (ta2) sr9Var.f.get();
                long j8 = rr9Var.c.a;
                zb2 zb2Var = (zb2) ta2Var;
                vxd vxdVar = zb2Var.H0;
                if (vxdVar != null) {
                    vxdVar.cancel((CancellationException) null);
                }
                zb2Var.H0 = j47.T(zb2Var.Z, zb2Var.Y, null, new yb2(zb2Var, null), 2);
                vz2 vz2Var = new vz2(gi9VarC0);
                av0 av0Var = sr9Var.c;
                av0Var.c(vz2Var);
                if (e52VarZ == null || !rr9Var.c.b.equals("REMOVED")) {
                    return;
                }
                av0Var.c(new xfc(e52VarZ.a));
                return;
            case 21:
                wle wleVar2 = (wle) this.b;
                at9 at9Var = (at9) this.c;
                mz6 mz6Var = (mz6) wleVar2.f.getValue();
                synchronized (mz6Var) {
                    try {
                        if (at9Var.o == ((p7b) ((m7b) mz6Var.b.get())).a.t()) {
                            return;
                        }
                        ((xb9) mz6Var.g.get()).r(at9Var);
                        e52 e52VarZ2 = ((p82) mz6Var.h.get()).z(at9Var.c);
                        if (e52VarZ2 != null) {
                            hm9.n("mz6", "onNotif, chat.id = " + e52VarZ2.a);
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            Map mapA = mz6Var.a(e52VarZ2.a);
                            if (mapA == null) {
                                mapA = new ConcurrentHashMap();
                                mz6Var.k.put(Long.valueOf(e52VarZ2.a), mapA);
                            }
                            mapA.put(Long.valueOf(at9Var.o), new kr9(jCurrentTimeMillis2, at9Var.X));
                            ((ScheduledExecutorService) mz6Var.f.get()).schedule(new u05(1, e52VarZ2.a, at9Var.o, mz6Var), 6000L, TimeUnit.MILLISECONDS);
                            mz6Var.b(e52VarZ2.a);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 22:
                mq3 mq3Var = (mq3) ((wle) this.b).h.getValue();
                mq3Var.getClass();
                StringBuilder sb3 = new StringBuilder("onNotifContactSort: ");
                wr9 wr9Var = (wr9) this.c;
                sb3.append(wr9Var);
                hm9.n("mq3", sb3.toString());
                ArrayList arrayList = wr9Var.c;
                ArrayList arrayList2 = wr9Var.X;
                hm9.m("mq3", "onNotifContactSort, ids count = %d, phones count = $d", Integer.valueOf(arrayList2 != null ? arrayList2.size() : 0), Integer.valueOf(arrayList != null ? arrayList.size() : 0));
                je7 je7Var = mq3Var.b;
                je7 je7Var2 = mq3Var.a;
                je7 je7Var3 = mq3Var.c;
                if (arrayList != null) {
                    mq3Var.e = new eq1();
                    kk5 kk5Var = (kk5) ((zi5) je7Var3.getValue());
                    kk5Var.getClass();
                    if (pag.K(new File(kk5Var.b(), "phonesSort"), mq3Var.e)) {
                        ((p7b) ((m7b) je7Var2.getValue())).a.l("user.phonesSortLastSync", Long.valueOf(System.currentTimeMillis()));
                    } else {
                        hm9.p("mq3", "Failed to store phones sort", null);
                    }
                    ((av0) je7Var.getValue()).c(new su(10));
                    return;
                }
                if (wr9Var.X == null) {
                    hm9.p("mq3", "Wrong notif contact sort data", null);
                    return;
                }
                mq3Var.d = new eq1();
                kk5 kk5Var2 = (kk5) ((zi5) je7Var3.getValue());
                kk5Var2.getClass();
                if (pag.K(new File(kk5Var2.b(), "contactSort"), mq3Var.d)) {
                    ((p7b) ((m7b) je7Var2.getValue())).a.l("user.contactSortLastSync", Long.valueOf(System.currentTimeMillis()));
                } else {
                    hm9.p("mq3", "Failed to store contact sort", null);
                }
                ((av0) je7Var.getValue()).c(new su(3));
                return;
            case 23:
                wle wleVar3 = (wle) this.b;
                ys9 ys9Var = (ys9) this.c;
                zs9 zs9Var = (zs9) ((s7d) wleVar3.i.getValue()).o.getValue();
                String name = zs9.class.getName();
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null) {
                    zs9Var.getClass();
                    if (ir6Var2.c()) {
                        ir6Var2.d(us7.X, name, "onNotifProfile: response = " + ys9Var.c, null);
                    }
                }
                ((blb) zs9Var.a.getValue()).b(ys9Var.c);
                wm3 wm3Var = ys9Var.c.a;
                if (wm3Var != null) {
                    ((r47) zs9Var.b.getValue()).a(Collections.singletonList(Long.valueOf(wm3Var.a)));
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                qr9 qr9Var = (qr9) ((s7d) ((wle) this.b).i.getValue()).i.getValue();
                qr9Var.getClass();
                StringBuilder sb4 = new StringBuilder("onNotifCallbackAnswer: ");
                pr9 pr9Var = (pr9) this.c;
                sb4.append(pr9Var);
                hm9.n(qr9.d, sb4.toString());
                bc7 bc7Var3 = qr9.c[0];
                e52 e52VarZ3 = ((p82) qr9Var.b.get()).z(pr9Var.o);
                qr9Var.a.c(new hq1(e52VarZ3 != null ? e52VarZ3.a : -1L, pr9Var.c));
                return;
            case 25:
                fs9 fs9Var = (fs9) ((s7d) ((wle) this.b).i.getValue()).b.getValue();
                fs9Var.getClass();
                StringBuilder sb5 = new StringBuilder("onNotifMark, response = ");
                es9 es9Var = (es9) this.c;
                sb5.append(es9Var);
                hm9.n("fs9", sb5.toString());
                je7 je7Var4 = fs9Var.e;
                e52 e52VarZ4 = ((p82) je7Var4.getValue()).z(es9Var.c);
                if (e52VarZ4 == null) {
                    hm9.k0("fs9", null, "onNotifMark chat not found", Arrays.copyOf(new Object[0], 0));
                    return;
                }
                ((p82) je7Var4.getValue()).p0(e52VarZ4.a, es9Var.o, es9Var.X, es9Var.Y, true);
                s8g s8gVar = (s8g) fs9Var.b.getValue();
                long j9 = e52VarZ4.a;
                s8gVar.a(new s9d(j9));
                long jT = ((p7b) fs9Var.c).a.t();
                long j10 = es9Var.o;
                av0 av0Var2 = fs9Var.d;
                if (j10 != jT) {
                    av0Var2.c(new p72(j9));
                    return;
                }
                hm9.H("fs9", "onNotifMark, already read from another device or WEB", new Object[0]);
                je7 je7Var5 = fs9Var.f;
                cea ceaVar = (cea) je7Var5.getValue();
                k92 k92Var2 = e52VarZ4.b;
                ceaVar.f(k92Var2.a);
                if (e52VarZ4.e0()) {
                    p82 p82Var = (p82) je7Var4.getValue();
                    List listSingletonList2 = Collections.singletonList(Long.valueOf(j9));
                    mg4 mg4Var = mg4.REGULAR;
                    p82Var.getClass();
                    p82Var.f0("syncMessages", new f5(p82Var, mg4Var, listSingletonList2, 15));
                }
                k4a k4aVar = (k4a) ((pk) fs9Var.a.getValue());
                long j11 = k92Var2.a;
                k4aVar.j(j11);
                av0Var2.c(new vz2(Collections.singletonList(Long.valueOf(j9)), false));
                if (es9Var.Y <= 0) {
                    ((cea) je7Var5.getValue()).a(j11);
                    return;
                }
                return;
            case 26:
                t20 t20Var = (t20) ((s7d) ((wle) this.b).i.getValue()).f.getValue();
                t20Var.getClass();
                nr9 nr9Var = (nr9) this.c;
                if (nr9Var.c == 0 && nr9Var.o == 0 && nr9Var.X == 0) {
                    hm9.p("t20", "onNotifAttach bad response, empty videoId/audioId skipped", null);
                    return;
                }
                rm4 rm4Var3 = t20Var.a;
                au8 au8Var = (au8) rm4Var3.get();
                long j12 = nr9Var.c;
                long j13 = nr9Var.o;
                long j14 = nr9Var.X;
                au8Var.getClass();
                oz7 oz7Var = iu8.b;
                ArrayList arrayListS = au8Var.s();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayListS.iterator();
                while (it.hasNext()) {
                    cu8 cu8Var = (cu8) it.next();
                    if (cu8Var.n()) {
                        for (l20 l20Var : (List) cu8Var.z0.a) {
                            i10 i10Var = l20Var.e;
                            t20 t20Var2 = t20Var;
                            rm4 rm4Var4 = rm4Var3;
                            if ((i10Var != null && i10Var.a == j12) || (((k20Var = l20Var.d) != null && k20Var.a == j13) || ((s10Var = l20Var.j) != null && s10Var.a == j14))) {
                                arrayList3.add(cu8Var);
                            }
                            rm4Var3 = rm4Var4;
                            t20Var = t20Var2;
                        }
                    }
                    rm4Var3 = rm4Var3;
                    t20Var = t20Var;
                }
                t20 t20Var3 = t20Var;
                rm4 rm4Var5 = rm4Var3;
                if (arrayList3.isEmpty()) {
                    hm9.p("t20", "onNotifAttach: failed to find message by videoId/audioId/fileId, skipped", null);
                    return;
                }
                boolean zT = oag.t(nr9Var.Y);
                av0 av0Var3 = t20Var3.b;
                if (zT) {
                    hm9.n("t20", "onNotifAttach: updateStatusesForMessages");
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        cu8 cu8Var2 = (cu8) it2.next();
                        Iterator it3 = ((List) cu8Var2.z0.a).iterator();
                        while (true) {
                            boolean zHasNext = it3.hasNext();
                            j = cu8Var2.b;
                            if (zHasNext) {
                                l20 l20Var2 = (l20) it3.next();
                                z10 z10Var = l20Var2.x;
                                z10 z10Var2 = z10.c;
                                if (z10Var != z10Var2) {
                                    boolean z3 = nr9Var.c != 0 && l20Var2.a() && l20Var2.e.a == nr9Var.c;
                                    boolean z4 = nr9Var.o != 0 && l20Var2.i() && l20Var2.d.a == nr9Var.o;
                                    boolean z5 = nr9Var.X != 0 && l20Var2.c() && l20Var2.j.a == nr9Var.X;
                                    String str = l20Var2.r;
                                    if (z3 || z4 || z5) {
                                        t20Var3.d(j, str, z10Var2);
                                    } else if (l20Var2.x == z10.b && (l20Var2.i() || l20Var2.c() || l20Var2.a())) {
                                        t20Var3.d(j, str, z10.a);
                                    }
                                }
                            }
                        }
                        av0Var3.c(new l6f(cu8Var2.t0, j, 0));
                    }
                } else {
                    hm9.n("t20", "onNotifAttach: got error, mark message with ERROR status");
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        cu8 cu8Var3 = (cu8) it4.next();
                        ((au8) rm4Var5.get()).x(cu8Var3, iu8.s0);
                        av0Var3.c(new l6f(cu8Var3.t0, cu8Var3.b, 0));
                    }
                }
                r9d.y((s8g) t20Var3.c.get());
                return;
            case 27:
                wle wleVar4 = (wle) this.b;
                if (((p7b) wleVar4.a).a.G()) {
                    return;
                }
                js9 js9Var = (js9) ((s7d) wleVar4.i.getValue()).c.getValue();
                js9Var.getClass();
                js9Var.a((hs9) this.c, mg4.REGULAR);
                return;
            case 28:
                a();
                return;
            default:
                ((w7b) ((wle) this.b).m.getValue()).j((xs9) this.c);
                return;
        }
    }
}
