package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import com.google.android.material.ComGoogleAndroidMaterialR$style;
import defpackage.du3;
import defpackage.jpc;
import defpackage.oc;
import defpackage.s08;
import defpackage.s3a;
import defpackage.w46;
import defpackage.ynf;
import ru.ok.messages.views.dialogs.FrgDlgPermissions;

/* loaded from: classes2.dex */
public class FrgDlgPermissions extends FrgDlgBase {
    public static final int G1 = jpc.f3;
    public static final int H1 = jpc.I;
    public boolean F1;

    public static FrgDlgPermissions n1(String[] strArr, int i, int i2, int i3, boolean z) {
        FrgDlgPermissions frgDlgPermissions = new FrgDlgPermissions();
        Bundle bundle = new Bundle();
        bundle.putStringArray("ru.ok.tamtam.extra.PERMISSIONS", strArr);
        bundle.putInt("ru.ok.tamtam.extra.POSITIVE_BUTTON", i3);
        bundle.putInt("ru.ok.tamtam.extra.TITLE", i);
        bundle.putInt("ru.ok.tamtam.extra.CONTENT", i2);
        bundle.putBoolean("ru.ok.tamtam.extra.MODE_SETTINGS", z);
        frgDlgPermissions.X0(bundle);
        return frgDlgPermissions;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog h1() {
        Bundle bundleT0 = T0();
        this.F1 = bundleT0.getBoolean("ru.ok.tamtam.extra.MODE_SETTINGS");
        int i = bundleT0.getInt("ru.ok.tamtam.extra.CONTENT");
        int i2 = bundleT0.getInt("ru.ok.tamtam.extra.TITLE", G1);
        int i3 = bundleT0.getInt("ru.ok.tamtam.extra.POSITIVE_BUTTON", H1);
        s08 s08Var = new s08(new du3(U0(), ComGoogleAndroidMaterialR$style.Theme_MaterialComponents));
        oc ocVar = s08Var.a;
        ocVar.d = ocVar.a.getText(i2);
        s08Var.b(i);
        final int i4 = 0;
        s08 s08VarD = s08Var.d(i3, new DialogInterface.OnClickListener(this) { // from class: v46
            public final /* synthetic */ FrgDlgPermissions b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                FrgDlgPermissions frgDlgPermissions = this.b;
                switch (i4) {
                    case 0:
                        if (!frgDlgPermissions.F1) {
                            if (!frgDlgPermissions.T0().getBoolean("use.result.api", false)) {
                                String[] stringArray = frgDlgPermissions.T0().getStringArray("ru.ok.tamtam.extra.PERMISSIONS");
                                a aVarI0 = frgDlgPermissions.i0(true);
                                if (aVarI0 == null) {
                                    b bVarB0 = frgDlgPermissions.b0();
                                    if (bVarB0 != null) {
                                        int iJ0 = frgDlgPermissions.j0();
                                        String[] strArr = wmd.d;
                                        z7.O(bVarB0, stringArray, iJ0);
                                        wmd.H(wmd.r(bVarB0), stringArray);
                                        break;
                                    }
                                } else {
                                    wmd.D(aVarI0, stringArray, frgDlgPermissions.j0());
                                    break;
                                }
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("dialog:permissions:result", true);
                                frgDlgPermissions.f0().e0(frgDlgPermissions.L0, bundle);
                                break;
                            }
                        } else {
                            s3a s3aVarB0 = frgDlgPermissions.b0();
                            if (s3aVarB0 instanceof w46) {
                                ((w46) s3aVarB0).x();
                            }
                            ynf ynfVar = frgDlgPermissions.I0;
                            if (ynfVar instanceof w46) {
                                ((w46) ynfVar).x();
                                break;
                            }
                        }
                        break;
                    default:
                        int i6 = FrgDlgPermissions.G1;
                        b bVarB02 = frgDlgPermissions.b0();
                        if (bVarB02 != null) {
                            String[] strArr2 = wmd.d;
                            bVarB02.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", bVarB02.getPackageName(), null)));
                        }
                        s3a s3aVarB02 = frgDlgPermissions.b0();
                        if (s3aVarB02 instanceof w46) {
                            ((w46) s3aVarB02).v();
                        }
                        ynf ynfVar2 = frgDlgPermissions.I0;
                        if (ynfVar2 instanceof w46) {
                            ((w46) ynfVar2).v();
                            break;
                        }
                        break;
                }
            }
        });
        oc ocVar2 = s08VarD.a;
        ocVar2.m = false;
        if (this.F1) {
            int i5 = jpc.Y1;
            final int i6 = 1;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: v46
                public final /* synthetic */ FrgDlgPermissions b;

                {
                    this.b = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i52) {
                    FrgDlgPermissions frgDlgPermissions = this.b;
                    switch (i6) {
                        case 0:
                            if (!frgDlgPermissions.F1) {
                                if (!frgDlgPermissions.T0().getBoolean("use.result.api", false)) {
                                    String[] stringArray = frgDlgPermissions.T0().getStringArray("ru.ok.tamtam.extra.PERMISSIONS");
                                    a aVarI0 = frgDlgPermissions.i0(true);
                                    if (aVarI0 == null) {
                                        b bVarB0 = frgDlgPermissions.b0();
                                        if (bVarB0 != null) {
                                            int iJ0 = frgDlgPermissions.j0();
                                            String[] strArr = wmd.d;
                                            z7.O(bVarB0, stringArray, iJ0);
                                            wmd.H(wmd.r(bVarB0), stringArray);
                                            break;
                                        }
                                    } else {
                                        wmd.D(aVarI0, stringArray, frgDlgPermissions.j0());
                                        break;
                                    }
                                } else {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("dialog:permissions:result", true);
                                    frgDlgPermissions.f0().e0(frgDlgPermissions.L0, bundle);
                                    break;
                                }
                            } else {
                                s3a s3aVarB0 = frgDlgPermissions.b0();
                                if (s3aVarB0 instanceof w46) {
                                    ((w46) s3aVarB0).x();
                                }
                                ynf ynfVar = frgDlgPermissions.I0;
                                if (ynfVar instanceof w46) {
                                    ((w46) ynfVar).x();
                                    break;
                                }
                            }
                            break;
                        default:
                            int i62 = FrgDlgPermissions.G1;
                            b bVarB02 = frgDlgPermissions.b0();
                            if (bVarB02 != null) {
                                String[] strArr2 = wmd.d;
                                bVarB02.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", bVarB02.getPackageName(), null)));
                            }
                            s3a s3aVarB02 = frgDlgPermissions.b0();
                            if (s3aVarB02 instanceof w46) {
                                ((w46) s3aVarB02).v();
                            }
                            ynf ynfVar2 = frgDlgPermissions.I0;
                            if (ynfVar2 instanceof w46) {
                                ((w46) ynfVar2).v();
                                break;
                            }
                            break;
                    }
                }
            };
            ocVar2.k = ocVar2.a.getText(i5);
            ocVar2.l = onClickListener;
        }
        return s08VarD.create();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        s3a s3aVarB0 = b0();
        if (s3aVarB0 instanceof w46) {
            ((w46) s3aVarB0).d();
        }
        ynf ynfVar = this.I0;
        if (ynfVar instanceof w46) {
            ((w46) ynfVar).d();
        }
    }
}
