package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class pc extends Handler {
    public final /* synthetic */ int a = 0;
    public WeakReference b;

    public /* synthetic */ pc() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        rg8 rg8Var;
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                } else if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                tec tecVar = (tec) this.b.get();
                if (tecVar != null) {
                    int i2 = message.what;
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    Object obj = message.obj;
                    Bundle bundlePeekData = message.peekData();
                    SparseArray sparseArray = tecVar.h;
                    uec uecVar = null;
                    yec yecVar = tecVar.i;
                    switch (i2) {
                        case 0:
                            if (i3 == tecVar.g) {
                                tecVar.g = 0;
                                if (yecVar.y0 == tecVar) {
                                    if (yec.B0) {
                                        yecVar.toString();
                                    }
                                    yecVar.l();
                                }
                            }
                            if (((vec) sparseArray.get(i3)) != null) {
                                sparseArray.remove(i3);
                                break;
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (tecVar.f == 0 && i3 == tecVar.g && i4 >= 1) {
                                    tecVar.g = 0;
                                    tecVar.f = i4;
                                    vg8 vg8VarB = vg8.b(bundle);
                                    if (yecVar.y0 == tecVar) {
                                        if (yec.B0) {
                                            yecVar.toString();
                                            Objects.toString(vg8VarB);
                                        }
                                        yecVar.g(vg8VarB);
                                    }
                                    if (yecVar.y0 == tecVar) {
                                        yecVar.z0 = true;
                                        ArrayList arrayList = yecVar.v0;
                                        int size = arrayList.size();
                                        for (int i5 = 0; i5 < size; i5++) {
                                            ((uec) arrayList.get(i5)).b(yecVar.y0);
                                        }
                                        bg8 bg8Var = yecVar.X;
                                        if (bg8Var != null) {
                                            tec tecVar2 = yecVar.y0;
                                            int i6 = tecVar2.d;
                                            tecVar2.d = i6 + 1;
                                            tecVar2.b(10, i6, 0, bg8Var.a, null);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                vec vecVar = (vec) sparseArray.get(i3);
                                if (vecVar != null) {
                                    sparseArray.remove(i3);
                                    vecVar.a(bundle2);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                if (bundlePeekData != null) {
                                    bundlePeekData.getString("error");
                                }
                                Bundle bundle3 = (Bundle) obj;
                                if (((vec) sparseArray.get(i3)) != null) {
                                    sparseArray.remove(i3);
                                    Objects.toString(bundle3);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (tecVar.f != 0) {
                                    vg8 vg8VarB2 = vg8.b(bundle4);
                                    if (yecVar.y0 == tecVar) {
                                        if (yec.B0) {
                                            yecVar.toString();
                                            Objects.toString(vg8VarB2);
                                        }
                                        yecVar.g(vg8VarB2);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                vec vecVar2 = (vec) sparseArray.get(i3);
                                if (bundle5 == null || !bundle5.containsKey("routeId")) {
                                    vecVar2.getClass();
                                    Objects.toString(bundle5);
                                    break;
                                } else {
                                    sparseArray.remove(i3);
                                    vecVar2.a(bundle5);
                                    break;
                                }
                            }
                            break;
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (tecVar.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    zf8 zf8Var = bundle7 != null ? new zf8(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = parcelableArrayList.iterator();
                                    while (it.hasNext()) {
                                        Bundle bundle8 = (Bundle) it.next();
                                        if (bundle8 == null) {
                                            rg8Var = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            rg8Var = new rg8(bundle9 != null ? new zf8(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(rg8Var);
                                    }
                                    if (yecVar.y0 == tecVar) {
                                        if (yec.B0) {
                                            yecVar.toString();
                                            Objects.toString(arrayList2);
                                        }
                                        Iterator it2 = yecVar.v0.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                uec uecVar2 = (uec) it2.next();
                                                if (uecVar2.a() == i4) {
                                                    uecVar = uecVar2;
                                                }
                                            }
                                        }
                                        if (uecVar instanceof wec) {
                                            ((wec) uecVar).l(zf8Var, arrayList2);
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (yecVar.y0 == tecVar) {
                                ArrayList arrayList3 = yecVar.v0;
                                Iterator it3 = arrayList3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        uec uecVar3 = (uec) it3.next();
                                        if (uecVar3.a() == i4) {
                                            uecVar = uecVar3;
                                        }
                                    }
                                }
                                yt8 yt8Var = yecVar.A0;
                                if (yt8Var != null && (uecVar instanceof tg8)) {
                                    tg8 tg8Var = (tg8) uecVar;
                                    ah8 ah8Var = (ah8) ((zec) ((xu3) yt8Var.b).c);
                                    if (ah8Var.s == tg8Var) {
                                        ah8Var.h(ah8Var.c(), 2);
                                    }
                                }
                                arrayList3.remove(uecVar);
                                uecVar.c();
                                yecVar.m();
                                break;
                            }
                            break;
                    }
                    if (yec.B0) {
                        message.toString();
                        break;
                    }
                }
                break;
        }
    }

    public pc(tec tecVar) {
        this.b = new WeakReference(tecVar);
    }
}
