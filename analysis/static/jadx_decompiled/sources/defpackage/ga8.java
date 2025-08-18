package defpackage;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ga8 extends Binder implements kr6 {
    public final WeakReference c;

    public ga8(w98 w98Var) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.c = new WeakReference(w98Var);
    }

    public static kr6 k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof kr6)) {
            return (kr6) iInterfaceQueryLocalInterface;
        }
        jr6 jr6Var = new jr6();
        jr6Var.c = iBinder;
        return jr6Var;
    }

    @Override // defpackage.kr6
    public final void A(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            R(new ea8(k3b.c(bundle)));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for Commands", e);
        }
    }

    @Override // defpackage.kr6
    public final void D(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            R(new z16(22, qad.b(bundle)));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for SessionPositionInfo", e);
        }
    }

    @Override // defpackage.kr6
    public final void F0(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            G0(i, sad.a(bundle));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for SessionResult", e);
        }
    }

    public final void G0(int i, Object obj) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            w98 w98Var = (w98) this.c.get();
            if (w98Var == null) {
                return;
            }
            w98Var.b.s(i, obj);
            w98Var.a.G(new l40(i, 11, w98Var));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // defpackage.kr6
    public final void H(int i, Bundle bundle, Bundle bundle2) {
        obd obdVar;
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            w98 w98Var = (w98) this.c.get();
            int iF = (w98Var == null || (obdVar = w98Var.k) == null) ? -1 : obdVar.a.f();
            if (iF == -1) {
                return;
            }
            try {
                R(new y98(m4b.r(iF, bundle), 1, new k4b(bundle2.getBoolean(k4b.d, false), bundle2.getBoolean(k4b.e, false))));
            } catch (RuntimeException e) {
                z04.d0("Ignoring malformed Bundle for BundlingExclusions", e);
            }
        } catch (RuntimeException e2) {
            z04.d0("Ignoring malformed Bundle for PlayerInfo", e2);
        }
    }

    @Override // defpackage.kr6
    public final void M(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            G0(i, wf7.a(bundle));
        } catch (RuntimeException e) {
            z04.d0("Ignoring malformed Bundle for LibraryResult", e);
        }
    }

    public final void R(fa8 fa8Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            w98 w98Var = (w98) this.c.get();
            if (w98Var == null) {
                return;
            }
            oaf.W(w98Var.a.X, new vs5(w98Var, 17, fa8Var));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.kr6
    public final void b(int i) {
        R(new kp7(25));
    }

    @Override // defpackage.kr6
    public final void c(int i) {
        R(new kp7(26));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        String str;
        obd obdVar;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaController");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaController");
            return true;
        }
        if (i == 4001) {
            parcel.readInt();
            String string = parcel.readString();
            i3 = parcel.readInt();
            Bundle bundle = (Bundle) od2.b(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string)) {
                z04.c0("onChildrenChanged(): Ignoring empty parentId");
            } else if (i3 < 0) {
                str = "onChildrenChanged(): Ignoring negative itemCount: ";
                ey8.k(i3, str);
            } else if (bundle == null) {
                R(new kp7(27));
            } else {
                try {
                    oc8.a(bundle);
                    R(new kp7(27));
                } catch (RuntimeException e) {
                    z04.d0("Ignoring malformed Bundle for LibraryParams", e);
                }
            }
        } else if (i != 4002) {
            switch (i) {
                case 3001:
                    r(parcel.readInt(), (Bundle) od2.b(parcel, Bundle.CREATOR));
                    break;
                case 3002:
                    F0(parcel.readInt(), (Bundle) od2.b(parcel, Bundle.CREATOR));
                    break;
                case 3003:
                    M(parcel.readInt(), (Bundle) od2.b(parcel, Bundle.CREATOR));
                    break;
                case 3004:
                    int i4 = parcel.readInt();
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                    if (arrayListCreateTypedArrayList != null) {
                        try {
                            w98 w98Var = (w98) this.c.get();
                            int iF = (w98Var == null || (obdVar = w98Var.k) == null) ? -1 : obdVar.a.f();
                            if (iF == -1) {
                                break;
                            } else {
                                ww6 ww6VarI = zw6.i();
                                for (int i5 = 0; i5 < arrayListCreateTypedArrayList.size(); i5++) {
                                    Bundle bundle2 = (Bundle) arrayListCreateTypedArrayList.get(i5);
                                    bundle2.getClass();
                                    ww6VarI.a(c73.b(iF, bundle2));
                                }
                                R(new hd0(i4, ww6VarI.j()));
                                break;
                            }
                        } catch (RuntimeException e2) {
                            z04.d0("Ignoring malformed Bundle for CommandButton", e2);
                            break;
                        }
                    }
                    break;
                case 3005:
                    int i6 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Bundle bundle3 = (Bundle) od2.b(parcel, creator);
                    Bundle bundle4 = (Bundle) od2.b(parcel, creator);
                    if (bundle3 != null && bundle4 != null) {
                        try {
                            R(new z64(i6, y9d.a(bundle3), bundle4));
                            break;
                        } catch (RuntimeException e3) {
                            z04.d0("Ignoring malformed Bundle for SessionCommand", e3);
                            break;
                        }
                    } else {
                        z04.c0("Ignoring custom command with null args.");
                        break;
                    }
                case 3006:
                    c(parcel.readInt());
                    break;
                case 3007:
                    q0(parcel.readInt(), (Bundle) od2.b(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    break;
                case 3008:
                    D(parcel.readInt(), (Bundle) od2.b(parcel, Bundle.CREATOR));
                    break;
                case 3009:
                    A(parcel.readInt(), (Bundle) od2.b(parcel, Bundle.CREATOR));
                    break;
                case 3010:
                    parcel.readInt();
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    Bundle bundle5 = (Bundle) od2.b(parcel, creator2);
                    Bundle bundle6 = (Bundle) od2.b(parcel, creator2);
                    if (bundle5 != null && bundle6 != null) {
                        try {
                            try {
                                R(new y98(z9d.b(bundle5), 2, k3b.c(bundle6)));
                                break;
                            } catch (RuntimeException e4) {
                                z04.d0("Ignoring malformed Bundle for Commands", e4);
                                break;
                            }
                        } catch (RuntimeException e5) {
                            z04.d0("Ignoring malformed Bundle for SessionCommands", e5);
                            break;
                        }
                    }
                    break;
                case 3011:
                    b(parcel.readInt());
                    break;
                case 3012:
                    parcel.readInt();
                    if (((Bundle) od2.b(parcel, Bundle.CREATOR)) == null) {
                        z04.c0("Ignoring null Bundle for extras");
                        break;
                    } else {
                        R(new kp7(29));
                        break;
                    }
                case 3013:
                    int i7 = parcel.readInt();
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    H(i7, (Bundle) od2.b(parcel, creator3), (Bundle) od2.b(parcel, creator3));
                    break;
                case 3014:
                    parcel.readInt();
                    if (((PendingIntent) od2.b(parcel, PendingIntent.CREATOR)) == null) {
                        z04.c0("Ignoring null session activity intent");
                        break;
                    } else {
                        R(new kp7(28));
                        break;
                    }
                case 3015:
                    parcel.readInt();
                    try {
                        iad.a((Bundle) od2.b(parcel, Bundle.CREATOR));
                        R(new kp7(23));
                        break;
                    } catch (RuntimeException e6) {
                        z04.d0("Ignoring malformed Bundle for SessionError", e6);
                        break;
                    }
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel.readInt();
            String string2 = parcel.readString();
            i3 = parcel.readInt();
            Bundle bundle7 = (Bundle) od2.b(parcel, Bundle.CREATOR);
            if (TextUtils.isEmpty(string2)) {
                z04.c0("onSearchResultChanged(): Ignoring empty query");
            } else if (i3 < 0) {
                str = "onSearchResultChanged(): Ignoring negative itemCount: ";
                ey8.k(i3, str);
            } else if (bundle7 == null) {
                R(new kp7(24));
            } else {
                try {
                    oc8.a(bundle7);
                    R(new kp7(24));
                } catch (RuntimeException e7) {
                    z04.d0("Ignoring malformed Bundle for LibraryParams", e7);
                }
            }
        }
        return true;
    }

    @Override // defpackage.kr6
    public final void q0(int i, Bundle bundle, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(k4b.d, z);
        bundle2.putBoolean(k4b.e, true);
        H(i, bundle, bundle2);
    }

    @Override // defpackage.kr6
    public final void r(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            R(new z16(21, uh3.a(bundle)));
        } catch (RuntimeException e) {
            z04.d0("Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
            c(i);
        }
    }
}
