package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes2.dex */
public final /* synthetic */ class j2e implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o2e b;

    public /* synthetic */ j2e(o2e o2eVar, int i) {
        this.a = i;
        this.b = o2eVar;
    }

    @Override // defpackage.f6
    public final void run() throws Throwable {
        xlc xlcVar;
        int iN;
        int iN2;
        int iN3;
        int iN4;
        int iN5;
        int iN6;
        int iN7;
        int iN8;
        int iN9;
        int iN10;
        int iN11;
        int iN12;
        int iN13;
        int i;
        String string;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        switch (this.a) {
            case 0:
                this.b.f();
                return;
            default:
                o2e o2eVar = this.b;
                n4e n4eVar = (n4e) ((khe) ((k24) ((c34) o2eVar.c.get())).h.c).getValue();
                n4eVar.getClass();
                xlc xlcVarA = xlc.a(0, "SELECT * FROM stickers");
                ilc ilcVar = n4eVar.a;
                ilcVar.b();
                Cursor cursorO = ilcVar.o(xlcVarA, null);
                try {
                    iN = tfg.n(cursorO, "id");
                    iN2 = tfg.n(cursorO, "sticker_id");
                    iN3 = tfg.n(cursorO, "width");
                    iN4 = tfg.n(cursorO, "height");
                    iN5 = tfg.n(cursorO, "url");
                    iN6 = tfg.n(cursorO, "update_time");
                    iN7 = tfg.n(cursorO, "mp4_url");
                    iN8 = tfg.n(cursorO, "first_url");
                    iN9 = tfg.n(cursorO, "preview_url");
                    iN10 = tfg.n(cursorO, "tags");
                    iN11 = tfg.n(cursorO, "sticker_type");
                    iN12 = tfg.n(cursorO, "set_id");
                    iN13 = tfg.n(cursorO, "lottie_url");
                    xlcVar = xlcVarA;
                } catch (Throwable th) {
                    th = th;
                    xlcVar = xlcVarA;
                }
                try {
                    int iN14 = tfg.n(cursorO, MediaStreamTrack.AUDIO_TRACK_KIND);
                    int iN15 = tfg.n(cursorO, "author_type");
                    int iN16 = tfg.n(cursorO, "video_url");
                    int i6 = iN13;
                    ArrayList arrayList = new ArrayList(cursorO.getCount());
                    while (true) {
                        ArrayList arrayList2 = arrayList;
                        if (!cursorO.moveToNext()) {
                            cursorO.close();
                            xlcVar.n();
                            ArrayList arrayList3 = new ArrayList(z53.S(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                u2e u2eVar = (u2e) it.next();
                                r2e r2eVar = new r2e();
                                r2eVar.a = u2eVar.a;
                                r2eVar.b = u2eVar.b;
                                r2eVar.c = u2eVar.c;
                                r2eVar.d = u2eVar.d;
                                r2eVar.e = u2eVar.e;
                                r2eVar.f = u2eVar.f;
                                r2eVar.g = u2eVar.g;
                                r2eVar.h = u2eVar.h;
                                r2eVar.i = u2eVar.i;
                                r2eVar.j = u2eVar.j;
                                r2eVar.k = u2eVar.k;
                                r2eVar.l = u2eVar.l;
                                r2eVar.m = u2eVar.m;
                                r2eVar.n = u2eVar.n;
                                r2eVar.o = u2eVar.o;
                                r2eVar.p = u2eVar.p;
                                arrayList3.add(new s2e(r2eVar));
                            }
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                s2e s2eVar = (s2e) it2.next();
                                e20 e20Var = new e20();
                                e20Var.a = s2eVar.c;
                                e20Var.b = s2eVar.o;
                                e20Var.c = s2eVar.X;
                                e20Var.d = s2eVar.Y;
                                e20Var.e = s2eVar.Z;
                                e20Var.f = s2eVar.s0;
                                e20Var.g = s2eVar.t0;
                                e20Var.h = s2eVar.u0;
                                e20Var.i = s2eVar.v0;
                                e20Var.j = s2eVar.w0;
                                e20Var.k = s2eVar.x0;
                                e20Var.l = s2eVar.y0;
                                e20Var.m = s2eVar.z0;
                                e20Var.n = s2eVar.A0;
                                e20Var.o = s2eVar.B0;
                                d2e d2eVarB = e20Var.b();
                                o2eVar.a.put(Long.valueOf(d2eVarB.a), d2eVarB);
                            }
                            ConcurrentHashMap concurrentHashMap = o2eVar.b;
                            synchronized (o2eVar) {
                                try {
                                    Object objV = pag.v(((kk5) ((zi5) o2eVar.e.get())).p());
                                    if (objV != null) {
                                        Map map = (Map) objV;
                                        if (!map.isEmpty()) {
                                            concurrentHashMap.putAll(map);
                                        }
                                    }
                                } catch (Exception e) {
                                    hm9.l("o2e", "Failed to load initial showcase", e);
                                    ((p7b) o2eVar.d).a.l("user.stickersLastSync", 0L);
                                }
                            }
                            o2eVar.l.e(o2eVar.b.values());
                            return;
                        }
                        long j = cursorO.getLong(iN);
                        long j2 = cursorO.getLong(iN2);
                        int i7 = cursorO.getInt(iN3);
                        int i8 = cursorO.getInt(iN4);
                        String string2 = cursorO.isNull(iN5) ? null : cursorO.getString(iN5);
                        long j3 = cursorO.getLong(iN6);
                        String string3 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                        String string4 = cursorO.isNull(iN8) ? null : cursorO.getString(iN8);
                        String string5 = cursorO.isNull(iN9) ? null : cursorO.getString(iN9);
                        int i9 = iN;
                        int i10 = iN2;
                        List listQ0 = w9e.Q0(cursorO.isNull(iN10) ? null : cursorO.getString(iN10), new String[]{","}, false, 6);
                        int i11 = cursorO.getInt(iN11);
                        if (i11 != 0) {
                            if (i11 == 10) {
                                i5 = 2;
                            } else if (i11 == 20) {
                                i = 3;
                            } else {
                                if (i11 != 40) {
                                    throw new IllegalArgumentException("No such value " + i11 + " for StickerType");
                                }
                                i5 = 4;
                            }
                            i = i5;
                        } else {
                            i = 1;
                        }
                        long j4 = cursorO.getLong(iN12);
                        int i12 = i6;
                        if (cursorO.isNull(i12)) {
                            i2 = iN14;
                            string = null;
                        } else {
                            string = cursorO.getString(i12);
                            i2 = iN14;
                        }
                        if (cursorO.getInt(i2) != 0) {
                            i3 = iN12;
                            i6 = i12;
                            i4 = iN15;
                            z = true;
                        } else {
                            i3 = iN12;
                            i6 = i12;
                            i4 = iN15;
                            z = false;
                        }
                        int i13 = cursorO.getInt(i4);
                        iN15 = i4;
                        int[] iArrV = au1.v(3);
                        int i14 = iN11;
                        int length = iArrV.length;
                        int i15 = i2;
                        int i16 = 0;
                        while (i16 < length) {
                            int i17 = iArrV[i16];
                            int[] iArr = iArrV;
                            if (k7d.c(i17) == i13) {
                                int i18 = iN16;
                                arrayList2.add(new u2e(j, j2, i7, i8, string2, j3, string3, string4, string5, listQ0, i, j4, string, z, i17, cursorO.isNull(i18) ? null : cursorO.getString(i18)));
                                arrayList = arrayList2;
                                iN16 = i18;
                                iN11 = i14;
                                iN12 = i3;
                                iN = i9;
                                iN2 = i10;
                                iN14 = i15;
                            } else {
                                i16++;
                                iN16 = iN16;
                                listQ0 = listQ0;
                                iArrV = iArr;
                            }
                        }
                        Locale locale = Locale.ENGLISH;
                        throw new IllegalArgumentException("No such value " + i13 + " for StickerAuthorType");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursorO.close();
                    xlcVar.n();
                    throw th;
                }
        }
    }
}
