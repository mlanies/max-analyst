package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zo7 extends jp7 {
    public final /* synthetic */ int c;
    public final ContentResolver d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zo7(Executor executor, y7g y7gVar, ContentResolver contentResolver, int i) {
        super(executor, y7gVar);
        this.c = i;
        this.d = contentResolver;
    }

    @Override // defpackage.jp7
    public final g05 d(wv6 wv6Var) throws IOException {
        g05 g05Var;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        InputStream inputStreamCreateInputStream;
        ContentResolver contentResolver = this.d;
        switch (this.c) {
            case 0:
                Uri uri = wv6Var.b;
                Uri uri2 = e9f.a;
                if (uri.getPath() == null || !"content".equals(e9f.b(uri)) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith(e9f.a.getPath())) {
                    if (e9f.d(uri)) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                        } catch (FileNotFoundException unused) {
                            g05Var = null;
                        }
                        if (parcelFileDescriptorOpenFileDescriptor == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        g05 g05VarC = c(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
                        parcelFileDescriptorOpenFileDescriptor.close();
                        g05Var = g05VarC;
                        if (g05Var != null) {
                            return g05Var;
                        }
                    }
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        return c(inputStreamOpenInputStream, -1);
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (uri.toString().endsWith("/photo")) {
                    inputStreamCreateInputStream = contentResolver.openInputStream(uri);
                } else if (uri.toString().endsWith("/display_photo")) {
                    try {
                        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                    } catch (IOException unused2) {
                        throw new IOException("Contact photo does not exist: " + uri);
                    }
                } else {
                    InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
                    if (inputStreamOpenContactPhotoInputStream == null) {
                        throw new IOException("Contact photo does not exist: " + uri);
                    }
                    inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
                }
                if (inputStreamCreateInputStream != null) {
                    return c(inputStreamCreateInputStream, -1);
                }
                throw new IllegalStateException("Required value was null.".toString());
            default:
                InputStream inputStreamOpenInputStream2 = contentResolver.openInputStream(wv6Var.b);
                if (inputStreamOpenInputStream2 != null) {
                    return c(inputStreamOpenInputStream2, -1);
                }
                throw new IllegalStateException("ContentResolver returned null InputStream".toString());
        }
    }

    @Override // defpackage.jp7
    public final String e() {
        switch (this.c) {
            case 0:
                return "LocalContentUriFetchProducer";
            default:
                return "QualifiedResourceFetchProducer";
        }
    }
}
