package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class b9c implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xlc b;
    public final /* synthetic */ d9c c;

    public /* synthetic */ b9c(d9c d9cVar, xlc xlcVar, int i) {
        this.a = i;
        this.c = d9cVar;
        this.b = xlcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        lh4 lh4Var;
        cy4 cy4Var;
        g03 g03Var;
        lh4 lh4Var2;
        cy4 cy4Var2;
        g03 g03Var2;
        lh4 lh4Var3;
        cy4 cy4Var3;
        g03 g03Var3;
        lh4 lh4Var4;
        cy4 cy4Var4;
        g03 g03Var4;
        lh4 lh4Var5;
        cy4 cy4Var5;
        g03 g03Var5;
        switch (this.a) {
            case 0:
                Integer numValueOf = null;
                Cursor cursorO = this.c.a.o(this.b, null);
                try {
                    int iN = tfg.n(cursorO, "id");
                    int iN2 = tfg.n(cursorO, "recent_type");
                    int iN3 = tfg.n(cursorO, "recent_time");
                    int iN4 = tfg.n(cursorO, "server_id");
                    int iN5 = tfg.n(cursorO, "sticker_id");
                    int iN6 = tfg.n(cursorO, "emoji");
                    int iN7 = tfg.n(cursorO, "gif");
                    int iN8 = tfg.n(cursorO, "gif_id");
                    if (cursorO.moveToFirst()) {
                        if (cursorO.isNull(iN5)) {
                            lh4Var = null;
                        } else {
                            lh4Var = new lh4();
                            lh4Var.a = cursorO.getLong(iN5);
                        }
                        if (cursorO.isNull(iN6)) {
                            cy4Var = null;
                        } else {
                            cy4Var = new cy4();
                            if (cursorO.isNull(iN6)) {
                                cy4Var.a = null;
                            } else {
                                cy4Var.a = cursorO.getString(iN6);
                            }
                        }
                        if (cursorO.isNull(iN7) && cursorO.isNull(iN8)) {
                            g03Var = null;
                        } else {
                            g03Var = new g03(6);
                            if (cursorO.isNull(iN7)) {
                                g03Var.c = null;
                            } else {
                                g03Var.c = cursorO.getBlob(iN7);
                            }
                            g03Var.b = cursorO.getLong(iN8);
                        }
                        e9c e9cVar = new e9c();
                        e9cVar.a = cursorO.getLong(iN);
                        if (!cursorO.isNull(iN2)) {
                            numValueOf = Integer.valueOf(cursorO.getInt(iN2));
                        }
                        e9cVar.b = xfg.x(numValueOf);
                        e9cVar.c = cursorO.getLong(iN3);
                        e9cVar.d = cursorO.getLong(iN4);
                        e9cVar.e = lh4Var;
                        e9cVar.f = cy4Var;
                        e9cVar.g = g03Var;
                        numValueOf = e9cVar;
                    }
                    cursorO.close();
                    return numValueOf;
                } finally {
                    cursorO.close();
                }
            case 1:
                Integer numValueOf2 = null;
                Cursor cursorO2 = this.c.a.o(this.b, null);
                try {
                    int iN9 = tfg.n(cursorO2, "id");
                    int iN10 = tfg.n(cursorO2, "recent_type");
                    int iN11 = tfg.n(cursorO2, "recent_time");
                    int iN12 = tfg.n(cursorO2, "server_id");
                    int iN13 = tfg.n(cursorO2, "sticker_id");
                    int iN14 = tfg.n(cursorO2, "emoji");
                    int iN15 = tfg.n(cursorO2, "gif");
                    int iN16 = tfg.n(cursorO2, "gif_id");
                    if (cursorO2.moveToFirst()) {
                        if (cursorO2.isNull(iN13)) {
                            lh4Var2 = null;
                        } else {
                            lh4Var2 = new lh4();
                            lh4Var2.a = cursorO2.getLong(iN13);
                        }
                        if (cursorO2.isNull(iN14)) {
                            cy4Var2 = null;
                        } else {
                            cy4Var2 = new cy4();
                            if (cursorO2.isNull(iN14)) {
                                cy4Var2.a = null;
                            } else {
                                cy4Var2.a = cursorO2.getString(iN14);
                            }
                        }
                        if (cursorO2.isNull(iN15) && cursorO2.isNull(iN16)) {
                            g03Var2 = null;
                        } else {
                            g03Var2 = new g03(6);
                            if (cursorO2.isNull(iN15)) {
                                g03Var2.c = null;
                            } else {
                                g03Var2.c = cursorO2.getBlob(iN15);
                            }
                            g03Var2.b = cursorO2.getLong(iN16);
                        }
                        e9c e9cVar2 = new e9c();
                        e9cVar2.a = cursorO2.getLong(iN9);
                        if (!cursorO2.isNull(iN10)) {
                            numValueOf2 = Integer.valueOf(cursorO2.getInt(iN10));
                        }
                        e9cVar2.b = xfg.x(numValueOf2);
                        e9cVar2.c = cursorO2.getLong(iN11);
                        e9cVar2.d = cursorO2.getLong(iN12);
                        e9cVar2.e = lh4Var2;
                        e9cVar2.f = cy4Var2;
                        e9cVar2.g = g03Var2;
                        numValueOf2 = e9cVar2;
                    }
                    cursorO2.close();
                    return numValueOf2;
                } finally {
                    cursorO2.close();
                }
            case 2:
                Integer numValueOf3 = null;
                Cursor cursorO3 = this.c.a.o(this.b, null);
                try {
                    int iN17 = tfg.n(cursorO3, "id");
                    int iN18 = tfg.n(cursorO3, "recent_type");
                    int iN19 = tfg.n(cursorO3, "recent_time");
                    int iN20 = tfg.n(cursorO3, "server_id");
                    int iN21 = tfg.n(cursorO3, "sticker_id");
                    int iN22 = tfg.n(cursorO3, "emoji");
                    int iN23 = tfg.n(cursorO3, "gif");
                    int iN24 = tfg.n(cursorO3, "gif_id");
                    if (cursorO3.moveToFirst()) {
                        if (cursorO3.isNull(iN21)) {
                            lh4Var3 = null;
                        } else {
                            lh4Var3 = new lh4();
                            lh4Var3.a = cursorO3.getLong(iN21);
                        }
                        if (cursorO3.isNull(iN22)) {
                            cy4Var3 = null;
                        } else {
                            cy4Var3 = new cy4();
                            if (cursorO3.isNull(iN22)) {
                                cy4Var3.a = null;
                            } else {
                                cy4Var3.a = cursorO3.getString(iN22);
                            }
                        }
                        if (cursorO3.isNull(iN23) && cursorO3.isNull(iN24)) {
                            g03Var3 = null;
                        } else {
                            g03Var3 = new g03(6);
                            if (cursorO3.isNull(iN23)) {
                                g03Var3.c = null;
                            } else {
                                g03Var3.c = cursorO3.getBlob(iN23);
                            }
                            g03Var3.b = cursorO3.getLong(iN24);
                        }
                        e9c e9cVar3 = new e9c();
                        e9cVar3.a = cursorO3.getLong(iN17);
                        if (!cursorO3.isNull(iN18)) {
                            numValueOf3 = Integer.valueOf(cursorO3.getInt(iN18));
                        }
                        e9cVar3.b = xfg.x(numValueOf3);
                        e9cVar3.c = cursorO3.getLong(iN19);
                        e9cVar3.d = cursorO3.getLong(iN20);
                        e9cVar3.e = lh4Var3;
                        e9cVar3.f = cy4Var3;
                        e9cVar3.g = g03Var3;
                        numValueOf3 = e9cVar3;
                    }
                    cursorO3.close();
                    return numValueOf3;
                } finally {
                    cursorO3.close();
                }
            case 3:
                Integer numValueOf4 = null;
                Cursor cursorO4 = this.c.a.o(this.b, null);
                try {
                    int iN25 = tfg.n(cursorO4, "id");
                    int iN26 = tfg.n(cursorO4, "recent_type");
                    int iN27 = tfg.n(cursorO4, "recent_time");
                    int iN28 = tfg.n(cursorO4, "server_id");
                    int iN29 = tfg.n(cursorO4, "sticker_id");
                    int iN30 = tfg.n(cursorO4, "emoji");
                    int iN31 = tfg.n(cursorO4, "gif");
                    int iN32 = tfg.n(cursorO4, "gif_id");
                    if (cursorO4.moveToFirst()) {
                        if (cursorO4.isNull(iN29)) {
                            lh4Var4 = null;
                        } else {
                            lh4Var4 = new lh4();
                            lh4Var4.a = cursorO4.getLong(iN29);
                        }
                        if (cursorO4.isNull(iN30)) {
                            cy4Var4 = null;
                        } else {
                            cy4Var4 = new cy4();
                            if (cursorO4.isNull(iN30)) {
                                cy4Var4.a = null;
                            } else {
                                cy4Var4.a = cursorO4.getString(iN30);
                            }
                        }
                        if (cursorO4.isNull(iN31) && cursorO4.isNull(iN32)) {
                            g03Var4 = null;
                        } else {
                            g03Var4 = new g03(6);
                            if (cursorO4.isNull(iN31)) {
                                g03Var4.c = null;
                            } else {
                                g03Var4.c = cursorO4.getBlob(iN31);
                            }
                            g03Var4.b = cursorO4.getLong(iN32);
                        }
                        e9c e9cVar4 = new e9c();
                        e9cVar4.a = cursorO4.getLong(iN25);
                        if (!cursorO4.isNull(iN26)) {
                            numValueOf4 = Integer.valueOf(cursorO4.getInt(iN26));
                        }
                        e9cVar4.b = xfg.x(numValueOf4);
                        e9cVar4.c = cursorO4.getLong(iN27);
                        e9cVar4.d = cursorO4.getLong(iN28);
                        e9cVar4.e = lh4Var4;
                        e9cVar4.f = cy4Var4;
                        e9cVar4.g = g03Var4;
                        numValueOf4 = e9cVar4;
                    }
                    cursorO4.close();
                    return numValueOf4;
                } finally {
                }
            default:
                String str = null;
                Cursor cursorO5 = this.c.a.o(this.b, null);
                try {
                    int iN33 = tfg.n(cursorO5, "id");
                    int iN34 = tfg.n(cursorO5, "recent_type");
                    int iN35 = tfg.n(cursorO5, "recent_time");
                    int iN36 = tfg.n(cursorO5, "server_id");
                    int iN37 = tfg.n(cursorO5, "sticker_id");
                    int iN38 = tfg.n(cursorO5, "emoji");
                    int iN39 = tfg.n(cursorO5, "gif");
                    int iN40 = tfg.n(cursorO5, "gif_id");
                    ArrayList arrayList = new ArrayList(cursorO5.getCount());
                    while (cursorO5.moveToNext()) {
                        if (cursorO5.isNull(iN37)) {
                            lh4Var5 = str;
                        } else {
                            lh4 lh4Var6 = new lh4();
                            lh4Var6.a = cursorO5.getLong(iN37);
                            lh4Var5 = lh4Var6;
                        }
                        if (cursorO5.isNull(iN38)) {
                            cy4Var5 = str;
                        } else {
                            cy4 cy4Var6 = new cy4();
                            if (cursorO5.isNull(iN38)) {
                                cy4Var6.a = str;
                                cy4Var5 = cy4Var6;
                            } else {
                                cy4Var6.a = cursorO5.getString(iN38);
                                cy4Var5 = cy4Var6;
                            }
                        }
                        if (cursorO5.isNull(iN39) && cursorO5.isNull(iN40)) {
                            g03Var5 = str;
                        } else {
                            g03 g03Var6 = new g03(6);
                            if (cursorO5.isNull(iN39)) {
                                g03Var6.c = str;
                            } else {
                                g03Var6.c = cursorO5.getBlob(iN39);
                            }
                            g03Var6.b = cursorO5.getLong(iN40);
                            g03Var5 = g03Var6;
                        }
                        e9c e9cVar5 = new e9c();
                        int i = iN34;
                        e9cVar5.a = cursorO5.getLong(iN33);
                        e9cVar5.b = xfg.x(cursorO5.isNull(i) ? null : Integer.valueOf(cursorO5.getInt(i)));
                        e9cVar5.c = cursorO5.getLong(iN35);
                        e9cVar5.d = cursorO5.getLong(iN36);
                        e9cVar5.e = lh4Var5;
                        e9cVar5.f = cy4Var5;
                        e9cVar5.g = g03Var5;
                        arrayList.add(e9cVar5);
                        iN34 = i;
                        str = null;
                    }
                    cursorO5.close();
                    return arrayList;
                } finally {
                }
        }
    }

    public final void finalize() {
        switch (this.a) {
            case 0:
                this.b.n();
                break;
            case 1:
                this.b.n();
                break;
            case 2:
                this.b.n();
                break;
            case 3:
                this.b.n();
                break;
            default:
                this.b.n();
                break;
        }
    }
}
