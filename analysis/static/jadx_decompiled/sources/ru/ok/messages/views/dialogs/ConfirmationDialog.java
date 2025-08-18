package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.a;
import defpackage.dy7;
import defpackage.kpa;
import defpackage.oc;
import defpackage.q5;
import defpackage.qg3;
import defpackage.rg3;
import defpackage.s08;
import defpackage.s3a;
import ru.ok.messages.views.dialogs.ConfirmationDialog;

/* loaded from: classes2.dex */
public final class ConfirmationDialog extends DialogFragment {
    public boolean B1;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog h1() {
        int i;
        int i2;
        int i3;
        int i4;
        Bundle bundleT0 = T0();
        String string = bundleT0.getString("ru.ok.tamtam.extra.TITLE");
        CharSequence charSequence = bundleT0.getCharSequence("ru.ok.tamtam.extra.CONTENT");
        String string2 = bundleT0.getString("ru.ok.tamtam.extra.POSITIVE_TEXT");
        String string3 = bundleT0.getString("ru.ok.tamtam.extra.NEGATIVE_TEXT");
        if (TextUtils.isEmpty(string) && (i4 = bundleT0.getInt("ru.ok.tamtam.extra.TITLE_RES_ID")) != 0) {
            string = h0(i4);
        }
        if (TextUtils.isEmpty(charSequence) && (i3 = bundleT0.getInt("ru.ok.tamtam.extra.CONTENT_RES_ID")) != 0) {
            charSequence = h0(i3);
        }
        if (TextUtils.isEmpty(string2) && (i2 = bundleT0.getInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID")) != 0) {
            string2 = h0(i2);
        }
        if (TextUtils.isEmpty(string3) && (i = bundleT0.getInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID")) != 0) {
            string3 = h0(i);
        }
        s08 s08VarE = new s08(U0()).e(string);
        oc ocVar = s08VarE.a;
        ocVar.f = charSequence;
        final int i5 = 0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: pg3
            public final /* synthetic */ ConfirmationDialog b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                switch (i5) {
                    case 0:
                        ConfirmationDialog confirmationDialog = this.b;
                        Bundle bundle = confirmationDialog.Z;
                        Bundle bundle2 = bundle != null ? bundle.getBundle("oneme:share:data") : null;
                        confirmationDialog.f0().e0("ConfirmationDialog:request_key", dy7.g(new kpa("POSITIVE", rg3.a)));
                        a aVarI0 = confirmationDialog.i0(true);
                        if (aVarI0 == 0) {
                            s3a s3aVarB0 = confirmationDialog.b0();
                            if (s3aVarB0 instanceof qg3) {
                                ((qg3) s3aVarB0).R(bundle2);
                            } else if (s3aVarB0 instanceof q5) {
                                Intent intent = new Intent();
                                intent.putExtra("oneme:share:data", bundle2);
                                ((q5) s3aVarB0).onActivityResult(confirmationDialog.j0(), -1, intent);
                            }
                        } else if (aVarI0 instanceof qg3) {
                            ((qg3) aVarI0).R(bundle2);
                        } else {
                            Intent intent2 = new Intent();
                            intent2.putExtra("oneme:share:data", bundle2);
                            aVarI0.s0(confirmationDialog.j0(), -1, intent2);
                        }
                        confirmationDialog.B1 = true;
                        break;
                    default:
                        this.b.l1();
                        break;
                }
            }
        };
        ocVar.g = string2;
        ocVar.h = onClickListener;
        final int i6 = 1;
        DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener(this) { // from class: pg3
            public final /* synthetic */ ConfirmationDialog b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i62) {
                switch (i6) {
                    case 0:
                        ConfirmationDialog confirmationDialog = this.b;
                        Bundle bundle = confirmationDialog.Z;
                        Bundle bundle2 = bundle != null ? bundle.getBundle("oneme:share:data") : null;
                        confirmationDialog.f0().e0("ConfirmationDialog:request_key", dy7.g(new kpa("POSITIVE", rg3.a)));
                        a aVarI0 = confirmationDialog.i0(true);
                        if (aVarI0 == 0) {
                            s3a s3aVarB0 = confirmationDialog.b0();
                            if (s3aVarB0 instanceof qg3) {
                                ((qg3) s3aVarB0).R(bundle2);
                            } else if (s3aVarB0 instanceof q5) {
                                Intent intent = new Intent();
                                intent.putExtra("oneme:share:data", bundle2);
                                ((q5) s3aVarB0).onActivityResult(confirmationDialog.j0(), -1, intent);
                            }
                        } else if (aVarI0 instanceof qg3) {
                            ((qg3) aVarI0).R(bundle2);
                        } else {
                            Intent intent2 = new Intent();
                            intent2.putExtra("oneme:share:data", bundle2);
                            aVarI0.s0(confirmationDialog.j0(), -1, intent2);
                        }
                        confirmationDialog.B1 = true;
                        break;
                    default:
                        this.b.l1();
                        break;
                }
            }
        };
        ocVar.k = string3;
        ocVar.l = onClickListener2;
        return s08VarE.create();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l1() {
        if (this.B1) {
            return;
        }
        Bundle bundle = this.Z;
        Bundle bundle2 = bundle != null ? bundle.getBundle("oneme:share:data") : null;
        f0().e0("ConfirmationDialog:request_key", dy7.g(new kpa("NEGATIVE", rg3.b)));
        a aVarI0 = i0(true);
        if (aVarI0 == 0) {
            s3a s3aVarB0 = b0();
            if (s3aVarB0 instanceof qg3) {
                ((qg3) s3aVarB0).getClass();
            } else if (s3aVarB0 instanceof q5) {
                Intent intent = new Intent();
                intent.putExtra("oneme:share:data", bundle2);
                ((q5) s3aVarB0).onActivityResult(j0(), 0, intent);
            }
        } else if (aVarI0 instanceof qg3) {
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("oneme:share:data", bundle2);
            aVarI0.s0(j0(), 0, intent2);
        }
        this.B1 = true;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l1();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        l1();
    }
}
