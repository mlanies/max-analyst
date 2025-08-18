package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m68 extends Handler {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m68(ii8 ii8Var, Looper looper) {
        super(looper);
        this.c = ii8Var;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.c;
                if (weakReference != null) {
                    Messenger messenger = (Messenger) weakReference.get();
                    o68 o68Var = (o68) ((WeakReference) this.b).get();
                    if (messenger != null && o68Var != null) {
                        Bundle data = message.getData();
                        bi8.a(data);
                        try {
                            int i = message.what;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        message.toString();
                                        break;
                                    } else {
                                        bi8.a(data.getBundle("data_options"));
                                        bi8.a(data.getBundle("data_notify_children_changed_options"));
                                        String string = data.getString("data_media_item_id");
                                        ArrayList parcelableArrayList = data.getParcelableArrayList("data_media_item_list");
                                        Parcelable.Creator<p68> creator = p68.CREATOR;
                                        if (parcelableArrayList != null) {
                                            ArrayList arrayList = new ArrayList();
                                            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                                                arrayList.add(mf7.a((Parcelable) parcelableArrayList.get(i2), creator));
                                            }
                                        }
                                        if (o68Var.g != messenger) {
                                            break;
                                        } else {
                                            if (string != null) {
                                                au1.r(o68Var.e.get(string));
                                            }
                                            int i3 = q68.b;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                bi8.a(data.getBundle("data_root_hints"));
                                data.getString("data_media_item_id");
                                break;
                            }
                        } catch (BadParcelableException unused) {
                            return;
                        }
                    }
                }
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }

    public m68(o68 o68Var) {
        this.b = new WeakReference(o68Var);
    }
}
