package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class ike implements ava {
    public String a;
    public final String b;
    public final Context c;
    public final r61 d;
    public final ztc e;
    public final f5a f;
    public final f6a g;
    public final c34 h;
    public final m7b i;
    public final o45 j;

    public ike(Context context, r61 r61Var, ztc ztcVar, f5a f5aVar, f6a f6aVar, c34 c34Var, m7b m7bVar, o45 o45Var) {
        this.b = context.getString(c2c.tt_contact_account_type);
        this.c = context;
        this.d = r61Var;
        this.e = ztcVar;
        this.f = f5aVar;
        this.g = f6aVar;
        this.h = c34Var;
        this.i = m7bVar;
        this.j = o45Var;
    }

    public static Uri b(Uri uri) {
        return uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [ike] */
    @Override // defpackage.ava
    public final void a(ArrayList arrayList) {
        ?? EmptyList;
        List listEmptyList;
        ?? EmptyList2;
        RuntimeException runtimeException;
        m2e m2eVar = new m2e(26);
        if (arrayList == null || arrayList.isEmpty()) {
            EmptyList = Collections.emptyList();
        } else {
            EmptyList = new ArrayList();
            for (Object obj : arrayList) {
                try {
                    if (m2eVar.test(obj)) {
                        EmptyList.add(Long.valueOf(((wua) obj).Y));
                    }
                } finally {
                }
            }
        }
        el3 el3Var = (el3) this.d.a.getValue();
        if (el3Var != null) {
            listEmptyList = el3Var.k();
        } else {
            hm9.o("r61", "contactController is null");
            listEmptyList = Collections.emptyList();
        }
        if (listEmptyList == null || listEmptyList.isEmpty()) {
            EmptyList2 = Collections.emptyList();
        } else {
            EmptyList2 = new ArrayList();
            for (Object obj2 : listEmptyList) {
                try {
                    if (EmptyList.contains(Long.valueOf(((uj3) obj2).o()))) {
                        EmptyList2.add(Long.valueOf(((uj3) obj2).n()));
                    }
                } finally {
                }
            }
        }
        hm9.m("ike", "onPhonebookUpdated: phones=%s, serverPhones=%s, contactIds=%s", Integer.valueOf(arrayList.size()), Integer.valueOf(EmptyList.size()), Integer.valueOf(EmptyList2.size()));
        if (EmptyList2.isEmpty()) {
            return;
        }
        f(EmptyList2);
    }

    public final Uri c() {
        return ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.a).appendQueryParameter("account_type", this.b).build();
    }

    public final void d(uj3 uj3Var, String str, String str2, String str3) throws RemoteException, OperationApplicationException {
        Context context = this.c;
        ContentResolver contentResolver = context.getContentResolver();
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newInsert(b(ContactsContract.RawContacts.CONTENT_URI)).withValue("account_name", this.a);
        String str4 = this.b;
        arrayList.add(builderWithValue.withValue("account_type", str4).withValue("sync1", Long.valueOf(uj3Var.n())).build());
        arrayList.add(ContentProviderOperation.newInsert(b(ContactsContract.Settings.CONTENT_URI)).withValue("account_name", this.a).withValue("account_type", str4).withValue("ungrouped_visible", 1).build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        arrayList.add(ContentProviderOperation.newInsert(b(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
        arrayList.add(ContentProviderOperation.newInsert(b(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str3).withValue("data2", 2).build());
        arrayList.add(ContentProviderOperation.newInsert(b(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", context.getString(c2c.tt_contact_mimetype)).withValue("data1", Long.valueOf(uj3Var.n())).withValue("data2", Long.valueOf(uj3Var.o())).withValue("data3", uj3Var.d()).build());
        try {
            contentResolver.applyBatch("com.android.contacts", arrayList);
        } catch (Exception e) {
            hm9.p("ike", "Exception when add for contact our mime type", e);
            ((cba) this.j).c(new HandledException(e), true);
        }
    }

    public final void e(Set set) {
        hm9.m("ike", "removeContacts: count=%s", Integer.valueOf(set.size()));
        if (set.isEmpty()) {
            return;
        }
        try {
            hm9.m("ike", "removeContacts: deleted count=%s", Integer.valueOf(this.c.getContentResolver().delete(c(), set.size() == 0 ? null : String.format("%1$s IN (%2$s)", "sync1", oag.v(set)), null)));
        } catch (Exception e) {
            hm9.p("ike", "removeContacts exception", e);
            ((cba) this.j).c(new HandledException(e), true);
        }
    }

    public final void f(Collection collection) {
        hm9.m("ike", "sync: count=%s", Integer.valueOf(collection.size()));
        if (collection.isEmpty()) {
            return;
        }
        this.e.b(new av2((Object) this, (Object) collection, false, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:361:0x035b, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.util.Collection r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 1822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ike.g(java.util.Collection, boolean):void");
    }
}
