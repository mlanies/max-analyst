package ru.ok.tamtam.nano;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import defpackage.nd7;
import defpackage.py7;
import defpackage.qw8;
import defpackage.s36;
import defpackage.x43;
import defpackage.y37;
import defpackage.y43;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.webrtc.EglBase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public interface Tasks {
    public static final int EMOJI = 0;
    public static final int FAVORITE_STICKER = 3;
    public static final int FAVORITE_STICKER_SET = 4;
    public static final int RECENT = 5;
    public static final int STICKER = 1;
    public static final int STICKER_REACTION = 1;
    public static final int STICKER_SET = 2;
    public static final int UNKNOWN = 0;

    public static final class AssetsAdd extends qw8 {
        private static volatile AssetsAdd[] _emptyArray;
        public int assetType;
        public long id;
        public long requestId;

        public AssetsAdd() {
            clear();
        }

        public static AssetsAdd[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsAdd[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsAdd parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsAdd) qw8.mergeFrom(new AssetsAdd(), bArr);
        }

        public AssetsAdd clear() {
            this.requestId = 0L;
            this.assetType = 0;
            this.id = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            int i = this.assetType;
            if (i != 0) {
                iH += y43.f(2, i);
            }
            long j2 = this.id;
            return j2 != 0 ? iH + y43.h(3, j2) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                y43Var.w(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                y43Var.x(3, j2);
            }
        }

        public static AssetsAdd parseFrom(x43 x43Var) throws IOException {
            return new AssetsAdd().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public AssetsAdd mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    int iP = x43Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                        this.assetType = iP;
                    }
                } else if (iS == 24) {
                    this.id = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class AssetsListModify extends qw8 {
        private static volatile AssetsListModify[] _emptyArray;
        public int assetType;
        public long[] ids;
        public long modifyTime;
        public long requestId;

        public AssetsListModify() {
            clear();
        }

        public static AssetsListModify[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsListModify[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsListModify parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsListModify) qw8.mergeFrom(new AssetsListModify(), bArr);
        }

        public AssetsListModify clear() {
            this.requestId = 0L;
            this.assetType = 0;
            this.ids = nd7.d;
            this.modifyTime = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long[] jArr;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? y43.h(1, j) : 0;
            int i2 = this.assetType;
            if (i2 != 0) {
                iH += y43.f(2, i2);
            }
            long[] jArr2 = this.ids;
            if (jArr2 != null && jArr2.length > 0) {
                int iK = 0;
                while (true) {
                    jArr = this.ids;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK += y43.k(jArr[i]);
                    i++;
                }
                iH = iH + iK + jArr.length;
            }
            long j2 = this.modifyTime;
            return j2 != 0 ? iH + y43.h(4, j2) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                y43Var.w(2, i);
            }
            long[] jArr = this.ids;
            if (jArr != null && jArr.length > 0) {
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    y43Var.x(3, jArr2[i2]);
                    i2++;
                }
            }
            long j2 = this.modifyTime;
            if (j2 != 0) {
                y43Var.x(4, j2);
            }
        }

        public static AssetsListModify parseFrom(x43 x43Var) throws IOException {
            return new AssetsListModify().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public AssetsListModify mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    int iP = x43Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                        this.assetType = iP;
                    }
                } else if (iS == 24) {
                    int iW = nd7.w(x43Var, 24);
                    long[] jArr = this.ids;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = iW + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = x43Var.q();
                        x43Var.s();
                        length++;
                    }
                    jArr2[length] = x43Var.q();
                    this.ids = jArr2;
                } else if (iS == 26) {
                    int iE = x43Var.e(x43Var.p());
                    int iC = x43Var.c();
                    int i2 = 0;
                    while (x43Var.b() > 0) {
                        x43Var.q();
                        i2++;
                    }
                    x43Var.t(iC);
                    long[] jArr3 = this.ids;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = x43Var.q();
                        length2++;
                    }
                    this.ids = jArr4;
                    x43Var.d(iE);
                } else if (iS == 32) {
                    this.modifyTime = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class AssetsMove extends qw8 {
        private static volatile AssetsMove[] _emptyArray;
        public int assetType;
        public long id;
        public int position;
        public long prevId;
        public long requestId;

        public AssetsMove() {
            clear();
        }

        public static AssetsMove[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsMove[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsMove parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsMove) qw8.mergeFrom(new AssetsMove(), bArr);
        }

        public AssetsMove clear() {
            this.requestId = 0L;
            this.assetType = 0;
            this.id = 0L;
            this.prevId = 0L;
            this.position = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            int i = this.assetType;
            if (i != 0) {
                iH += y43.f(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                iH += y43.h(3, j2);
            }
            long j3 = this.prevId;
            if (j3 != 0) {
                iH += y43.h(4, j3);
            }
            int i2 = this.position;
            return i2 != 0 ? iH + y43.f(5, i2) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                y43Var.w(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                y43Var.x(3, j2);
            }
            long j3 = this.prevId;
            if (j3 != 0) {
                y43Var.x(4, j3);
            }
            int i2 = this.position;
            if (i2 != 0) {
                y43Var.w(5, i2);
            }
        }

        public static AssetsMove parseFrom(x43 x43Var) throws IOException {
            return new AssetsMove().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public AssetsMove mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    int iP = x43Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                        this.assetType = iP;
                    }
                } else if (iS == 24) {
                    this.id = x43Var.q();
                } else if (iS == 32) {
                    this.prevId = x43Var.q();
                } else if (iS == 40) {
                    this.position = x43Var.p();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class AssetsRemove extends qw8 {
        private static volatile AssetsRemove[] _emptyArray;
        public int assetType;
        public long id;
        public long[] ids;
        public long requestId;

        public AssetsRemove() {
            clear();
        }

        public static AssetsRemove[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new AssetsRemove[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static AssetsRemove parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (AssetsRemove) qw8.mergeFrom(new AssetsRemove(), bArr);
        }

        public AssetsRemove clear() {
            this.requestId = 0L;
            this.assetType = 0;
            this.id = 0L;
            this.ids = nd7.d;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? y43.h(1, j) : 0;
            int i2 = this.assetType;
            if (i2 != 0) {
                iH += y43.f(2, i2);
            }
            long j2 = this.id;
            if (j2 != 0) {
                iH += y43.h(3, j2);
            }
            long[] jArr = this.ids;
            if (jArr == null || jArr.length <= 0) {
                return iH;
            }
            int iK = 0;
            while (true) {
                long[] jArr2 = this.ids;
                if (i >= jArr2.length) {
                    return iH + iK + jArr2.length;
                }
                iK += y43.k(jArr2[i]);
                i++;
            }
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            int i = this.assetType;
            if (i != 0) {
                y43Var.w(2, i);
            }
            long j2 = this.id;
            if (j2 != 0) {
                y43Var.x(3, j2);
            }
            long[] jArr = this.ids;
            if (jArr == null || jArr.length <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.ids;
                if (i2 >= jArr2.length) {
                    return;
                }
                y43Var.x(4, jArr2[i2]);
                i2++;
            }
        }

        public static AssetsRemove parseFrom(x43 x43Var) throws IOException {
            return new AssetsRemove().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public AssetsRemove mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    int iP = x43Var.p();
                    if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                        this.assetType = iP;
                    }
                } else if (iS == 24) {
                    this.id = x43Var.q();
                } else if (iS == 32) {
                    int iW = nd7.w(x43Var, 32);
                    long[] jArr = this.ids;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = iW + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = x43Var.q();
                        x43Var.s();
                        length++;
                    }
                    jArr2[length] = x43Var.q();
                    this.ids = jArr2;
                } else if (iS == 34) {
                    int iE = x43Var.e(x43Var.p());
                    int iC = x43Var.c();
                    int i2 = 0;
                    while (x43Var.b() > 0) {
                        x43Var.q();
                        i2++;
                    }
                    x43Var.t(iC);
                    long[] jArr3 = this.ids;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = x43Var.q();
                        length2++;
                    }
                    this.ids = jArr4;
                    x43Var.d(iE);
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChangeChatPhoto extends qw8 {
        private static volatile ChangeChatPhoto[] _emptyArray;
        public long chatId;
        public Rect crop;
        public String file;
        public long lastModified;
        public long requestId;

        public ChangeChatPhoto() {
            clear();
        }

        public static ChangeChatPhoto[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChangeChatPhoto[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChangeChatPhoto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChangeChatPhoto) qw8.mergeFrom(new ChangeChatPhoto(), bArr);
        }

        public ChangeChatPhoto clear() {
            this.requestId = 0L;
            this.file = "";
            this.chatId = 0L;
            this.crop = null;
            this.lastModified = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.file.equals("")) {
                iH += y43.l(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += y43.i(4, rect);
            }
            long j3 = this.lastModified;
            return j3 != 0 ? iH + y43.h(5, j3) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.file.equals("")) {
                y43Var.E(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                y43Var.y(4, rect);
            }
            long j3 = this.lastModified;
            if (j3 != 0) {
                y43Var.x(5, j3);
            }
        }

        public static ChangeChatPhoto parseFrom(x43 x43Var) throws IOException {
            return new ChangeChatPhoto().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChangeChatPhoto mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 18) {
                    this.file = x43Var.r();
                } else if (iS == 24) {
                    this.chatId = x43Var.q();
                } else if (iS == 34) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    x43Var.j(this.crop);
                } else if (iS == 40) {
                    this.lastModified = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChangeProfileOrChatPhoto extends qw8 {
        private static volatile ChangeProfileOrChatPhoto[] _emptyArray;
        public long chatId;
        public Rect crop;
        public String file;
        public long lastModified;
        public long requestId;

        public ChangeProfileOrChatPhoto() {
            clear();
        }

        public static ChangeProfileOrChatPhoto[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChangeProfileOrChatPhoto[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChangeProfileOrChatPhoto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChangeProfileOrChatPhoto) qw8.mergeFrom(new ChangeProfileOrChatPhoto(), bArr);
        }

        public ChangeProfileOrChatPhoto clear() {
            this.requestId = 0L;
            this.file = "";
            this.chatId = 0L;
            this.crop = null;
            this.lastModified = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.file.equals("")) {
                iH += y43.l(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += y43.i(4, rect);
            }
            long j3 = this.lastModified;
            return j3 != 0 ? iH + y43.h(5, j3) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.file.equals("")) {
                y43Var.E(2, this.file);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(3, j2);
            }
            Rect rect = this.crop;
            if (rect != null) {
                y43Var.y(4, rect);
            }
            long j3 = this.lastModified;
            if (j3 != 0) {
                y43Var.x(5, j3);
            }
        }

        public static ChangeProfileOrChatPhoto parseFrom(x43 x43Var) throws IOException {
            return new ChangeProfileOrChatPhoto().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChangeProfileOrChatPhoto mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 18) {
                    this.file = x43Var.r();
                } else if (iS == 24) {
                    this.chatId = x43Var.q();
                } else if (iS == 34) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    x43Var.j(this.crop);
                } else if (iS == 40) {
                    this.lastModified = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChannelLeave extends qw8 {
        private static volatile ChannelLeave[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long requestId;

        public ChannelLeave() {
            clear();
        }

        public static ChannelLeave[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChannelLeave[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChannelLeave parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChannelLeave) qw8.mergeFrom(new ChannelLeave(), bArr);
        }

        public ChannelLeave clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.chatServerId;
            return j3 != 0 ? iH + y43.h(3, j3) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
        }

        public static ChannelLeave parseFrom(x43 x43Var) throws IOException {
            return new ChannelLeave().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChannelLeave mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    this.chatServerId = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatClear extends qw8 {
        private static volatile ChatClear[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public boolean forAll;
        public long lastEventTime;
        public long requestId;

        public ChatClear() {
            clear();
        }

        public static ChatClear[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatClear[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatClear parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatClear) qw8.mergeFrom(new ChatClear(), bArr);
        }

        public ChatClear clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.lastEventTime = 0L;
            this.forAll = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                iH += y43.h(4, j4);
            }
            return this.forAll ? iH + y43.a(5) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                y43Var.x(4, j4);
            }
            boolean z = this.forAll;
            if (z) {
                y43Var.r(5, z);
            }
        }

        public static ChatClear parseFrom(x43 x43Var) throws IOException {
            return new ChatClear().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChatClear mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    this.chatServerId = x43Var.q();
                } else if (iS == 32) {
                    this.lastEventTime = x43Var.q();
                } else if (iS == 40) {
                    this.forAll = x43Var.f();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatClose extends qw8 {
        private static volatile ChatClose[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long requestId;

        public ChatClose() {
            clear();
        }

        public static ChatClose[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatClose[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatClose parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatClose) qw8.mergeFrom(new ChatClose(), bArr);
        }

        public ChatClose clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.chatServerId;
            return j3 != 0 ? iH + y43.h(3, j3) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
        }

        public static ChatClose parseFrom(x43 x43Var) throws IOException {
            return new ChatClose().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChatClose mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    this.chatServerId = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatComplain extends qw8 {
        private static volatile ChatComplain[] _emptyArray;
        public long chatId;
        public String complaint;
        public long requestId;

        public ChatComplain() {
            clear();
        }

        public static ChatComplain[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatComplain[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatComplain parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatComplain) qw8.mergeFrom(new ChatComplain(), bArr);
        }

        public ChatComplain clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.complaint = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            return !this.complaint.equals("") ? iH + y43.l(3, this.complaint) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            if (this.complaint.equals("")) {
                return;
            }
            y43Var.E(3, this.complaint);
        }

        public static ChatComplain parseFrom(x43 x43Var) throws IOException {
            return new ChatComplain().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChatComplain mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 26) {
                    this.complaint = x43Var.r();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatCreate extends qw8 {
        private static volatile ChatCreate[] _emptyArray;
        public long chatId;
        public String chatType;
        public long cid;
        public long groupId;
        public long requestId;
        public String startPayload;
        public long subjectId;
        public String subjectType;

        public ChatCreate() {
            clear();
        }

        public static ChatCreate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatCreate[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatCreate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatCreate) qw8.mergeFrom(new ChatCreate(), bArr);
        }

        public ChatCreate clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatType = "";
            this.groupId = 0L;
            this.subjectType = "";
            this.subjectId = 0L;
            this.startPayload = "";
            this.cid = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            if (!this.chatType.equals("")) {
                iH += y43.l(3, this.chatType);
            }
            long j3 = this.groupId;
            if (j3 != 0) {
                iH += y43.h(4, j3);
            }
            if (!this.subjectType.equals("")) {
                iH += y43.l(5, this.subjectType);
            }
            long j4 = this.subjectId;
            if (j4 != 0) {
                iH += y43.h(6, j4);
            }
            if (!this.startPayload.equals("")) {
                iH += y43.l(7, this.startPayload);
            }
            long j5 = this.cid;
            return j5 != 0 ? iH + y43.h(8, j5) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            if (!this.chatType.equals("")) {
                y43Var.E(3, this.chatType);
            }
            long j3 = this.groupId;
            if (j3 != 0) {
                y43Var.x(4, j3);
            }
            if (!this.subjectType.equals("")) {
                y43Var.E(5, this.subjectType);
            }
            long j4 = this.subjectId;
            if (j4 != 0) {
                y43Var.x(6, j4);
            }
            if (!this.startPayload.equals("")) {
                y43Var.E(7, this.startPayload);
            }
            long j5 = this.cid;
            if (j5 != 0) {
                y43Var.x(8, j5);
            }
        }

        public static ChatCreate parseFrom(x43 x43Var) throws IOException {
            return new ChatCreate().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChatCreate mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 26) {
                    this.chatType = x43Var.r();
                } else if (iS == 32) {
                    this.groupId = x43Var.q();
                } else if (iS == 42) {
                    this.subjectType = x43Var.r();
                } else if (iS == 48) {
                    this.subjectId = x43Var.q();
                } else if (iS == 58) {
                    this.startPayload = x43Var.r();
                } else if (iS == 64) {
                    this.cid = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatDelete extends qw8 {
        private static volatile ChatDelete[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public boolean forAll;
        public long lastEventTime;
        public long requestId;

        public ChatDelete() {
            clear();
        }

        public static ChatDelete[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatDelete[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatDelete parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatDelete) qw8.mergeFrom(new ChatDelete(), bArr);
        }

        public ChatDelete clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.lastEventTime = 0L;
            this.forAll = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                iH += y43.h(4, j4);
            }
            return this.forAll ? iH + y43.a(5) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            long j4 = this.lastEventTime;
            if (j4 != 0) {
                y43Var.x(4, j4);
            }
            boolean z = this.forAll;
            if (z) {
                y43Var.r(5, z);
            }
        }

        public static ChatDelete parseFrom(x43 x43Var) throws IOException {
            return new ChatDelete().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChatDelete mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    this.chatServerId = x43Var.q();
                } else if (iS == 32) {
                    this.lastEventTime = x43Var.q();
                } else if (iS == 40) {
                    this.forAll = x43Var.f();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatGroupMark extends qw8 {
        private static volatile ChatGroupMark[] _emptyArray;
        public long chatId;
        public boolean enabled;
        public String flagType;
        public long requestId;

        public ChatGroupMark() {
            clear();
        }

        public static ChatGroupMark[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatGroupMark[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatGroupMark parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatGroupMark) qw8.mergeFrom(new ChatGroupMark(), bArr);
        }

        public ChatGroupMark clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.flagType = "";
            this.enabled = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            if (!this.flagType.equals("")) {
                iH += y43.l(3, this.flagType);
            }
            return this.enabled ? iH + y43.a(4) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            if (!this.flagType.equals("")) {
                y43Var.E(3, this.flagType);
            }
            boolean z = this.enabled;
            if (z) {
                y43Var.r(4, z);
            }
        }

        public static ChatGroupMark parseFrom(x43 x43Var) throws IOException {
            return new ChatGroupMark().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChatGroupMark mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 26) {
                    this.flagType = x43Var.r();
                } else if (iS == 32) {
                    this.enabled = x43Var.f();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatHide extends qw8 {
        private static volatile ChatHide[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long requestId;

        public ChatHide() {
            clear();
        }

        public static ChatHide[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatHide[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatHide parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatHide) qw8.mergeFrom(new ChatHide(), bArr);
        }

        public ChatHide clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.chatServerId;
            return j3 != 0 ? iH + y43.h(3, j3) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
        }

        public static ChatHide parseFrom(x43 x43Var) throws IOException {
            return new ChatHide().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChatHide mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    this.chatServerId = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatMark extends qw8 {
        private static volatile ChatMark[] _emptyArray;
        public boolean awaitChatInCache;
        public long chatId;
        public long chatServerId;
        public boolean isReadReaction;
        public long mark;
        public long messageId;
        public long requestId;
        public boolean setAsUnread;

        public ChatMark() {
            clear();
        }

        public static ChatMark[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatMark[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatMark parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatMark) qw8.mergeFrom(new ChatMark(), bArr);
        }

        public ChatMark clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.mark = 0L;
            this.messageId = 0L;
            this.setAsUnread = false;
            this.awaitChatInCache = false;
            this.isReadReaction = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            long j4 = this.mark;
            if (j4 != 0) {
                iH += y43.h(4, j4);
            }
            long j5 = this.messageId;
            if (j5 != 0) {
                iH += y43.h(5, j5);
            }
            if (this.setAsUnread) {
                iH += y43.a(6);
            }
            if (this.awaitChatInCache) {
                iH += y43.a(7);
            }
            return this.isReadReaction ? iH + y43.a(8) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            long j4 = this.mark;
            if (j4 != 0) {
                y43Var.x(4, j4);
            }
            long j5 = this.messageId;
            if (j5 != 0) {
                y43Var.x(5, j5);
            }
            boolean z = this.setAsUnread;
            if (z) {
                y43Var.r(6, z);
            }
            boolean z2 = this.awaitChatInCache;
            if (z2) {
                y43Var.r(7, z2);
            }
            boolean z3 = this.isReadReaction;
            if (z3) {
                y43Var.r(8, z3);
            }
        }

        public static ChatMark parseFrom(x43 x43Var) throws IOException {
            return new ChatMark().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChatMark mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    this.chatServerId = x43Var.q();
                } else if (iS == 32) {
                    this.mark = x43Var.q();
                } else if (iS == 40) {
                    this.messageId = x43Var.q();
                } else if (iS == 48) {
                    this.setAsUnread = x43Var.f();
                } else if (iS == 56) {
                    this.awaitChatInCache = x43Var.f();
                } else if (iS == 64) {
                    this.isReadReaction = x43Var.f();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatMembersUpdate extends qw8 {
        private static volatile ChatMembersUpdate[] _emptyArray;
        public long chatId;
        public String chatMemberType;
        public long chatServerId;
        public String operation;
        public long requestId;
        public boolean showHistory;
        public long[] userIds;

        public ChatMembersUpdate() {
            clear();
        }

        public static ChatMembersUpdate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatMembersUpdate[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatMembersUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatMembersUpdate) qw8.mergeFrom(new ChatMembersUpdate(), bArr);
        }

        public ChatMembersUpdate clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.operation = "";
            this.userIds = nd7.d;
            this.chatMemberType = "";
            this.showHistory = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long[] jArr;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            if (!this.operation.equals("")) {
                iH += y43.l(4, this.operation);
            }
            long[] jArr2 = this.userIds;
            if (jArr2 != null && jArr2.length > 0) {
                int iK = 0;
                while (true) {
                    jArr = this.userIds;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK += y43.k(jArr[i]);
                    i++;
                }
                iH = iH + iK + jArr.length;
            }
            if (!this.chatMemberType.equals("")) {
                iH += y43.l(6, this.chatMemberType);
            }
            return this.showHistory ? iH + y43.a(7) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            if (!this.operation.equals("")) {
                y43Var.E(4, this.operation);
            }
            long[] jArr = this.userIds;
            if (jArr != null && jArr.length > 0) {
                int i = 0;
                while (true) {
                    long[] jArr2 = this.userIds;
                    if (i >= jArr2.length) {
                        break;
                    }
                    y43Var.x(5, jArr2[i]);
                    i++;
                }
            }
            if (!this.chatMemberType.equals("")) {
                y43Var.E(6, this.chatMemberType);
            }
            boolean z = this.showHistory;
            if (z) {
                y43Var.r(7, z);
            }
        }

        public static ChatMembersUpdate parseFrom(x43 x43Var) throws IOException {
            return new ChatMembersUpdate().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChatMembersUpdate mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    this.chatServerId = x43Var.q();
                } else if (iS == 34) {
                    this.operation = x43Var.r();
                } else if (iS == 40) {
                    int iW = nd7.w(x43Var, 40);
                    long[] jArr = this.userIds;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = iW + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = x43Var.q();
                        x43Var.s();
                        length++;
                    }
                    jArr2[length] = x43Var.q();
                    this.userIds = jArr2;
                } else if (iS == 42) {
                    int iE = x43Var.e(x43Var.p());
                    int iC = x43Var.c();
                    int i2 = 0;
                    while (x43Var.b() > 0) {
                        x43Var.q();
                        i2++;
                    }
                    x43Var.t(iC);
                    long[] jArr3 = this.userIds;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = x43Var.q();
                        length2++;
                    }
                    this.userIds = jArr4;
                    x43Var.d(iE);
                } else if (iS == 50) {
                    this.chatMemberType = x43Var.r();
                } else if (iS == 56) {
                    this.showHistory = x43Var.f();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatPinSetVisibility extends qw8 {
        private static volatile ChatPinSetVisibility[] _emptyArray;
        public long chatServerId;
        public long requestId;
        public boolean show;

        public ChatPinSetVisibility() {
            clear();
        }

        public static ChatPinSetVisibility[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatPinSetVisibility[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatPinSetVisibility parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatPinSetVisibility) qw8.mergeFrom(new ChatPinSetVisibility(), bArr);
        }

        public ChatPinSetVisibility clear() {
            this.requestId = 0L;
            this.chatServerId = 0L;
            this.show = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatServerId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            return this.show ? iH + y43.a(3) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatServerId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            boolean z = this.show;
            if (z) {
                y43Var.r(3, z);
            }
        }

        public static ChatPinSetVisibility parseFrom(x43 x43Var) throws IOException {
            return new ChatPinSetVisibility().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChatPinSetVisibility mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatServerId = x43Var.q();
                } else if (iS == 24) {
                    this.show = x43Var.f();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatSubscribe extends qw8 {
        private static volatile ChatSubscribe[] _emptyArray;
        public long chatServerId;
        public long requestId;
        public boolean subscribe;

        public ChatSubscribe() {
            clear();
        }

        public static ChatSubscribe[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatSubscribe[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatSubscribe parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatSubscribe) qw8.mergeFrom(new ChatSubscribe(), bArr);
        }

        public ChatSubscribe clear() {
            this.requestId = 0L;
            this.chatServerId = 0L;
            this.subscribe = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatServerId;
            if (j2 != 0) {
                iH += y43.h(3, j2);
            }
            return this.subscribe ? iH + y43.a(4) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatServerId;
            if (j2 != 0) {
                y43Var.x(3, j2);
            }
            boolean z = this.subscribe;
            if (z) {
                y43Var.r(4, z);
            }
        }

        public static ChatSubscribe parseFrom(x43 x43Var) throws IOException {
            return new ChatSubscribe().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChatSubscribe mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 24) {
                    this.chatServerId = x43Var.q();
                } else if (iS == 32) {
                    this.subscribe = x43Var.f();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ChatUpdate extends qw8 {
        private static volatile ChatUpdate[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public Rect crop;
        public String description;
        public boolean descriptionIsNull;
        public boolean notifyPin;
        public String photoToken;
        public boolean photoTokenIsNull;
        public long pinMessageId;
        public boolean pinMessageIdIsNull;
        public long requestId;
        public String theme;
        public boolean themeIsNull;

        public ChatUpdate() {
            clear();
        }

        public static ChatUpdate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatUpdate[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatUpdate) qw8.mergeFrom(new ChatUpdate(), bArr);
        }

        public ChatUpdate clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.theme = "";
            this.photoToken = "";
            this.crop = null;
            this.themeIsNull = false;
            this.photoTokenIsNull = false;
            this.pinMessageId = 0L;
            this.notifyPin = false;
            this.pinMessageIdIsNull = false;
            this.description = "";
            this.descriptionIsNull = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            if (!this.theme.equals("")) {
                iH += y43.l(4, this.theme);
            }
            if (!this.photoToken.equals("")) {
                iH += y43.l(5, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += y43.i(6, rect);
            }
            if (this.themeIsNull) {
                iH += y43.a(7);
            }
            if (this.photoTokenIsNull) {
                iH += y43.a(8);
            }
            long j4 = this.pinMessageId;
            if (j4 != 0) {
                iH += y43.h(9, j4);
            }
            if (this.notifyPin) {
                iH += y43.a(10);
            }
            if (this.pinMessageIdIsNull) {
                iH += y43.a(11);
            }
            if (!this.description.equals("")) {
                iH += y43.l(12, this.description);
            }
            return this.descriptionIsNull ? iH + y43.a(13) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            if (!this.theme.equals("")) {
                y43Var.E(4, this.theme);
            }
            if (!this.photoToken.equals("")) {
                y43Var.E(5, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                y43Var.y(6, rect);
            }
            boolean z = this.themeIsNull;
            if (z) {
                y43Var.r(7, z);
            }
            boolean z2 = this.photoTokenIsNull;
            if (z2) {
                y43Var.r(8, z2);
            }
            long j4 = this.pinMessageId;
            if (j4 != 0) {
                y43Var.x(9, j4);
            }
            boolean z3 = this.notifyPin;
            if (z3) {
                y43Var.r(10, z3);
            }
            boolean z4 = this.pinMessageIdIsNull;
            if (z4) {
                y43Var.r(11, z4);
            }
            if (!this.description.equals("")) {
                y43Var.E(12, this.description);
            }
            boolean z5 = this.descriptionIsNull;
            if (z5) {
                y43Var.r(13, z5);
            }
        }

        public static ChatUpdate parseFrom(x43 x43Var) throws IOException {
            return new ChatUpdate().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChatUpdate mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                switch (iS) {
                    case 0:
                        return this;
                    case 8:
                        this.requestId = x43Var.q();
                        break;
                    case 16:
                        this.chatId = x43Var.q();
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        this.chatServerId = x43Var.q();
                        break;
                    case 34:
                        this.theme = x43Var.r();
                        break;
                    case 42:
                        this.photoToken = x43Var.r();
                        break;
                    case 50:
                        if (this.crop == null) {
                            this.crop = new Rect();
                        }
                        x43Var.j(this.crop);
                        break;
                    case 56:
                        this.themeIsNull = x43Var.f();
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        this.photoTokenIsNull = x43Var.f();
                        break;
                    case 72:
                        this.pinMessageId = x43Var.q();
                        break;
                    case 80:
                        this.notifyPin = x43Var.f();
                        break;
                    case 88:
                        this.pinMessageIdIsNull = x43Var.f();
                        break;
                    case 98:
                        this.description = x43Var.r();
                        break;
                    case 104:
                        this.descriptionIsNull = x43Var.f();
                        break;
                    default:
                        if (!x43Var.u(iS)) {
                            return this;
                        }
                        break;
                }
            }
        }
    }

    public static final class ChatsList extends qw8 {
        private static volatile ChatsList[] _emptyArray;
        public long chatsSync;
        public int count;
        public long marker;
        public long requestId;

        public ChatsList() {
            clear();
        }

        public static ChatsList[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ChatsList[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ChatsList parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ChatsList) qw8.mergeFrom(new ChatsList(), bArr);
        }

        public ChatsList clear() {
            this.requestId = 0L;
            this.marker = 0L;
            this.count = 0;
            this.chatsSync = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.marker;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                iH += y43.f(3, i);
            }
            long j3 = this.chatsSync;
            return j3 != 0 ? iH + y43.h(4, j3) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.marker;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                y43Var.w(3, i);
            }
            long j3 = this.chatsSync;
            if (j3 != 0) {
                y43Var.x(4, j3);
            }
        }

        public static ChatsList parseFrom(x43 x43Var) throws IOException {
            return new ChatsList().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ChatsList mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.marker = x43Var.q();
                } else if (iS == 24) {
                    this.count = x43Var.p();
                } else if (iS == 32) {
                    this.chatsSync = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class Config extends qw8 {
        private static volatile Config[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public String[] excludedFolders;
        public a[] folders;
        public boolean isForFolders;
        public boolean isPushToken;
        public boolean isUserSettings;
        public long requestId;
        public boolean reset;
        public long[] syncChatIds;
        public Map<String, String> userSettings;

        public Config() {
            clear();
        }

        public static Config[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Config[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Config parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Config) qw8.mergeFrom(new Config(), bArr);
        }

        public Config clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.isPushToken = false;
            this.isUserSettings = false;
            this.userSettings = null;
            this.reset = false;
            this.syncChatIds = nd7.d;
            this.isForFolders = false;
            if (a.m == null) {
                synchronized (y37.b) {
                    try {
                        if (a.m == null) {
                            a.m = new a[0];
                        }
                    } finally {
                    }
                }
            }
            this.folders = a.m;
            this.excludedFolders = nd7.f;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long[] jArr;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            if (this.isPushToken) {
                iH += y43.a(4);
            }
            if (this.isUserSettings) {
                iH += y43.a(5);
            }
            Map<String, String> map = this.userSettings;
            if (map != null) {
                iH += y37.a(map, 6, 9, 9);
            }
            if (this.reset) {
                iH += y43.a(7);
            }
            long[] jArr2 = this.syncChatIds;
            if (jArr2 != null && jArr2.length > 0) {
                int i2 = 0;
                int iK = 0;
                while (true) {
                    jArr = this.syncChatIds;
                    if (i2 >= jArr.length) {
                        break;
                    }
                    iK += y43.k(jArr[i2]);
                    i2++;
                }
                iH = iH + iK + jArr.length;
            }
            if (this.isForFolders) {
                iH += y43.a(9);
            }
            a[] aVarArr = this.folders;
            if (aVarArr != null && aVarArr.length > 0) {
                int i3 = 0;
                while (true) {
                    a[] aVarArr2 = this.folders;
                    if (i3 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i3];
                    if (aVar != null) {
                        iH = y43.i(10, aVar) + iH;
                    }
                    i3++;
                }
            }
            String[] strArr = this.excludedFolders;
            if (strArr == null || strArr.length <= 0) {
                return iH;
            }
            int iJ = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.excludedFolders;
                if (i >= strArr2.length) {
                    return iH + iJ + i4;
                }
                String str = strArr2[i];
                if (str != null) {
                    i4++;
                    int iQ = y43.q(str);
                    iJ = y43.j(iQ) + iQ + iJ;
                }
                i++;
            }
        }

        @Override // defpackage.qw8
        public Config mergeFrom(x43 x43Var) throws IOException {
            py7 py7Var = s36.d;
            while (true) {
                int iS = x43Var.s();
                switch (iS) {
                    case 0:
                        return this;
                    case 8:
                        this.requestId = x43Var.q();
                        break;
                    case 16:
                        this.chatId = x43Var.q();
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        this.chatServerId = x43Var.q();
                        break;
                    case 32:
                        this.isPushToken = x43Var.f();
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        this.isUserSettings = x43Var.f();
                        break;
                    case 50:
                        this.userSettings = y37.b(x43Var, this.userSettings, py7Var, 9, 9, null, 10, 18);
                        break;
                    case 56:
                        this.reset = x43Var.f();
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        int iW = nd7.w(x43Var, 64);
                        long[] jArr = this.syncChatIds;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iW + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = x43Var.q();
                            x43Var.s();
                            length++;
                        }
                        jArr2[length] = x43Var.q();
                        this.syncChatIds = jArr2;
                        break;
                    case 66:
                        int iE = x43Var.e(x43Var.p());
                        int iC = x43Var.c();
                        int i2 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.q();
                            i2++;
                        }
                        x43Var.t(iC);
                        long[] jArr3 = this.syncChatIds;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = x43Var.q();
                            length2++;
                        }
                        this.syncChatIds = jArr4;
                        x43Var.d(iE);
                        break;
                    case 72:
                        this.isForFolders = x43Var.f();
                        break;
                    case 82:
                        int iW2 = nd7.w(x43Var, 82);
                        a[] aVarArr = this.folders;
                        int length3 = aVarArr == null ? 0 : aVarArr.length;
                        int i4 = iW2 + length3;
                        a[] aVarArr2 = new a[i4];
                        if (length3 != 0) {
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            a aVar = new a();
                            aVarArr2[length3] = aVar;
                            x43Var.j(aVar);
                            x43Var.s();
                            length3++;
                        }
                        a aVar2 = new a();
                        aVarArr2[length3] = aVar2;
                        x43Var.j(aVar2);
                        this.folders = aVarArr2;
                        break;
                    case 90:
                        int iW3 = nd7.w(x43Var, 90);
                        String[] strArr = this.excludedFolders;
                        int length4 = strArr == null ? 0 : strArr.length;
                        int i5 = iW3 + length4;
                        String[] strArr2 = new String[i5];
                        if (length4 != 0) {
                            System.arraycopy(strArr, 0, strArr2, 0, length4);
                        }
                        while (length4 < i5 - 1) {
                            strArr2[length4] = x43Var.r();
                            x43Var.s();
                            length4++;
                        }
                        strArr2[length4] = x43Var.r();
                        this.excludedFolders = strArr2;
                        break;
                    default:
                        if (!x43Var.u(iS)) {
                            return this;
                        }
                        break;
                }
            }
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            boolean z = this.isPushToken;
            if (z) {
                y43Var.r(4, z);
            }
            boolean z2 = this.isUserSettings;
            if (z2) {
                y43Var.r(5, z2);
            }
            Map<String, String> map = this.userSettings;
            if (map != null) {
                y37.d(y43Var, map, 6, 9, 9);
            }
            boolean z3 = this.reset;
            if (z3) {
                y43Var.r(7, z3);
            }
            long[] jArr = this.syncChatIds;
            int i = 0;
            if (jArr != null && jArr.length > 0) {
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.syncChatIds;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    y43Var.x(8, jArr2[i2]);
                    i2++;
                }
            }
            boolean z4 = this.isForFolders;
            if (z4) {
                y43Var.r(9, z4);
            }
            a[] aVarArr = this.folders;
            if (aVarArr != null && aVarArr.length > 0) {
                int i3 = 0;
                while (true) {
                    a[] aVarArr2 = this.folders;
                    if (i3 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i3];
                    if (aVar != null) {
                        y43Var.y(10, aVar);
                    }
                    i3++;
                }
            }
            String[] strArr = this.excludedFolders;
            if (strArr == null || strArr.length <= 0) {
                return;
            }
            while (true) {
                String[] strArr2 = this.excludedFolders;
                if (i >= strArr2.length) {
                    return;
                }
                String str = strArr2[i];
                if (str != null) {
                    y43Var.E(11, str);
                }
                i++;
            }
        }

        public static Config parseFrom(x43 x43Var) throws IOException {
            return new Config().mergeFrom(x43Var);
        }
    }

    public static final class ConfirmPresent extends qw8 {
        private static volatile ConfirmPresent[] _emptyArray;
        public boolean accept;
        public boolean asPrivate;
        public long chatId;
        public long chatServerId;
        public long messageId;
        public long messageServerId;
        public long metadataId;
        public long presentId;
        public long requestId;

        public ConfirmPresent() {
            clear();
        }

        public static ConfirmPresent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ConfirmPresent[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ConfirmPresent parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ConfirmPresent) qw8.mergeFrom(new ConfirmPresent(), bArr);
        }

        public ConfirmPresent clear() {
            this.requestId = 0L;
            this.presentId = 0L;
            this.metadataId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.messageId = 0L;
            this.messageServerId = 0L;
            this.accept = false;
            this.asPrivate = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.presentId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.metadataId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            long j4 = this.chatId;
            if (j4 != 0) {
                iH += y43.h(4, j4);
            }
            long j5 = this.chatServerId;
            if (j5 != 0) {
                iH += y43.h(5, j5);
            }
            long j6 = this.messageId;
            if (j6 != 0) {
                iH += y43.h(6, j6);
            }
            long j7 = this.messageServerId;
            if (j7 != 0) {
                iH += y43.h(7, j7);
            }
            if (this.accept) {
                iH += y43.a(8);
            }
            return this.asPrivate ? iH + y43.a(9) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.presentId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.metadataId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            long j4 = this.chatId;
            if (j4 != 0) {
                y43Var.x(4, j4);
            }
            long j5 = this.chatServerId;
            if (j5 != 0) {
                y43Var.x(5, j5);
            }
            long j6 = this.messageId;
            if (j6 != 0) {
                y43Var.x(6, j6);
            }
            long j7 = this.messageServerId;
            if (j7 != 0) {
                y43Var.x(7, j7);
            }
            boolean z = this.accept;
            if (z) {
                y43Var.r(8, z);
            }
            boolean z2 = this.asPrivate;
            if (z2) {
                y43Var.r(9, z2);
            }
        }

        public static ConfirmPresent parseFrom(x43 x43Var) throws IOException {
            return new ConfirmPresent().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ConfirmPresent mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.presentId = x43Var.q();
                } else if (iS == 24) {
                    this.metadataId = x43Var.q();
                } else if (iS == 32) {
                    this.chatId = x43Var.q();
                } else if (iS == 40) {
                    this.chatServerId = x43Var.q();
                } else if (iS == 48) {
                    this.messageId = x43Var.q();
                } else if (iS == 56) {
                    this.messageServerId = x43Var.q();
                } else if (iS == 64) {
                    this.accept = x43Var.f();
                } else if (iS == 72) {
                    this.asPrivate = x43Var.f();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class CongratsStatus extends qw8 {
        private static volatile CongratsStatus[] _emptyArray;
        public String holidayId;
        public long requestId;
        public boolean status;
        public long userId;

        public CongratsStatus() {
            clear();
        }

        public static CongratsStatus[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CongratsStatus[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static CongratsStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CongratsStatus) qw8.mergeFrom(new CongratsStatus(), bArr);
        }

        public CongratsStatus clear() {
            this.requestId = 0L;
            this.userId = 0L;
            this.status = false;
            this.holidayId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.userId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            if (this.status) {
                iH += y43.a(3);
            }
            return !this.holidayId.equals("") ? iH + y43.l(4, this.holidayId) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.userId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            boolean z = this.status;
            if (z) {
                y43Var.r(3, z);
            }
            if (this.holidayId.equals("")) {
                return;
            }
            y43Var.E(4, this.holidayId);
        }

        public static CongratsStatus parseFrom(x43 x43Var) throws IOException {
            return new CongratsStatus().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public CongratsStatus mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.userId = x43Var.q();
                } else if (iS == 24) {
                    this.status = x43Var.f();
                } else if (iS == 34) {
                    this.holidayId = x43Var.r();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ContactUpdate extends qw8 {
        private static volatile ContactUpdate[] _emptyArray;
        public String action;
        public long contactId;
        public String lastName;
        public String newName;
        public String oldLastName;
        public String oldName;
        public long requestId;

        public ContactUpdate() {
            clear();
        }

        public static ContactUpdate[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ContactUpdate[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ContactUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ContactUpdate) qw8.mergeFrom(new ContactUpdate(), bArr);
        }

        public ContactUpdate clear() {
            this.requestId = 0L;
            this.contactId = 0L;
            this.action = "";
            this.oldName = "";
            this.newName = "";
            this.lastName = "";
            this.oldLastName = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.contactId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            if (!this.action.equals("")) {
                iH += y43.l(3, this.action);
            }
            if (!this.oldName.equals("")) {
                iH += y43.l(4, this.oldName);
            }
            if (!this.newName.equals("")) {
                iH += y43.l(5, this.newName);
            }
            if (!this.lastName.equals("")) {
                iH += y43.l(6, this.lastName);
            }
            return !this.oldLastName.equals("") ? iH + y43.l(7, this.oldLastName) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.contactId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            if (!this.action.equals("")) {
                y43Var.E(3, this.action);
            }
            if (!this.oldName.equals("")) {
                y43Var.E(4, this.oldName);
            }
            if (!this.newName.equals("")) {
                y43Var.E(5, this.newName);
            }
            if (!this.lastName.equals("")) {
                y43Var.E(6, this.lastName);
            }
            if (this.oldLastName.equals("")) {
                return;
            }
            y43Var.E(7, this.oldLastName);
        }

        public static ContactUpdate parseFrom(x43 x43Var) throws IOException {
            return new ContactUpdate().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ContactUpdate mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.contactId = x43Var.q();
                } else if (iS == 26) {
                    this.action = x43Var.r();
                } else if (iS == 34) {
                    this.oldName = x43Var.r();
                } else if (iS == 42) {
                    this.newName = x43Var.r();
                } else if (iS == 50) {
                    this.lastName = x43Var.r();
                } else if (iS == 58) {
                    this.oldLastName = x43Var.r();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ContactVerify extends qw8 {
        private static volatile ContactVerify[] _emptyArray;
        public boolean confirm;
        public long contactId;
        public String localName;
        public long requestId;

        public ContactVerify() {
            clear();
        }

        public static ContactVerify[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ContactVerify[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ContactVerify parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ContactVerify) qw8.mergeFrom(new ContactVerify(), bArr);
        }

        public ContactVerify clear() {
            this.requestId = 0L;
            this.contactId = 0L;
            this.localName = "";
            this.confirm = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.contactId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            if (!this.localName.equals("")) {
                iH += y43.l(3, this.localName);
            }
            return this.confirm ? iH + y43.a(4) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.contactId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            if (!this.localName.equals("")) {
                y43Var.E(3, this.localName);
            }
            boolean z = this.confirm;
            if (z) {
                y43Var.r(4, z);
            }
        }

        public static ContactVerify parseFrom(x43 x43Var) throws IOException {
            return new ContactVerify().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ContactVerify mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.contactId = x43Var.q();
                } else if (iS == 26) {
                    this.localName = x43Var.r();
                } else if (iS == 32) {
                    this.confirm = x43Var.f();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class DraftDiscard extends qw8 {
        private static volatile DraftDiscard[] _emptyArray;
        public long chatId;
        public long requestId;
        public long serverTime;

        public DraftDiscard() {
            clear();
        }

        public static DraftDiscard[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new DraftDiscard[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static DraftDiscard parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (DraftDiscard) qw8.mergeFrom(new DraftDiscard(), bArr);
        }

        public DraftDiscard clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.serverTime = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.serverTime;
            return j3 != 0 ? iH + y43.h(3, j3) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.serverTime;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
        }

        public static DraftDiscard parseFrom(x43 x43Var) throws IOException {
            return new DraftDiscard().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public DraftDiscard mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    this.serverTime = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class DraftSave extends qw8 {
        private static volatile DraftSave[] _emptyArray;
        public long chatId;
        public byte[] draft;
        public long requestId;

        public DraftSave() {
            clear();
        }

        public static DraftSave[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new DraftSave[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static DraftSave parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (DraftSave) qw8.mergeFrom(new DraftSave(), bArr);
        }

        public DraftSave clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.draft = nd7.g;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            return !Arrays.equals(this.draft, nd7.g) ? iH + y43.b(3, this.draft) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            if (Arrays.equals(this.draft, nd7.g)) {
                return;
            }
            y43Var.s(3, this.draft);
        }

        public static DraftSave parseFrom(x43 x43Var) throws IOException {
            return new DraftSave().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public DraftSave mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 26) {
                    this.draft = x43Var.g();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class ExternalVideoSend extends qw8 {
        private static volatile ExternalVideoSend[] _emptyArray;
        public String attachLocalId;
        public long chatId;
        public String externalUrl;
        public long messageId;
        public long requestId;
        public String stickerId;

        public ExternalVideoSend() {
            clear();
        }

        public static ExternalVideoSend[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ExternalVideoSend[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ExternalVideoSend parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ExternalVideoSend) qw8.mergeFrom(new ExternalVideoSend(), bArr);
        }

        public ExternalVideoSend clear() {
            this.requestId = 0L;
            this.externalUrl = "";
            this.attachLocalId = "";
            this.messageId = 0L;
            this.chatId = 0L;
            this.stickerId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.externalUrl.equals("")) {
                iH += y43.l(2, this.externalUrl);
            }
            if (!this.attachLocalId.equals("")) {
                iH += y43.l(3, this.attachLocalId);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += y43.h(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                iH += y43.h(5, j3);
            }
            return !this.stickerId.equals("") ? iH + y43.l(6, this.stickerId) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.externalUrl.equals("")) {
                y43Var.E(2, this.externalUrl);
            }
            if (!this.attachLocalId.equals("")) {
                y43Var.E(3, this.attachLocalId);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                y43Var.x(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                y43Var.x(5, j3);
            }
            if (this.stickerId.equals("")) {
                return;
            }
            y43Var.E(6, this.stickerId);
        }

        public static ExternalVideoSend parseFrom(x43 x43Var) throws IOException {
            return new ExternalVideoSend().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public ExternalVideoSend mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 18) {
                    this.externalUrl = x43Var.r();
                } else if (iS == 26) {
                    this.attachLocalId = x43Var.r();
                } else if (iS == 32) {
                    this.messageId = x43Var.q();
                } else if (iS == 40) {
                    this.chatId = x43Var.q();
                } else if (iS == 50) {
                    this.stickerId = x43Var.r();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class FileDownload extends qw8 {
        private static volatile FileDownload[] _emptyArray;
        public String attachId;
        public long audioId;
        public boolean checkAutoloadConnection;
        public long fileId;
        public String fileName;
        public int invalidateCount;
        public long messageId;
        public long mp4GifId;
        public boolean notCopyVideoToGallery;
        public boolean notifyProgress;
        public long requestId;
        public long stickerId;
        public String url;
        public boolean useOriginalExtension;
        public long videoId;

        public FileDownload() {
            clear();
        }

        public static FileDownload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new FileDownload[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static FileDownload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (FileDownload) qw8.mergeFrom(new FileDownload(), bArr);
        }

        public FileDownload clear() {
            this.requestId = 0L;
            this.messageId = 0L;
            this.videoId = 0L;
            this.audioId = 0L;
            this.mp4GifId = 0L;
            this.url = "";
            this.attachId = "";
            this.notifyProgress = false;
            this.stickerId = 0L;
            this.fileId = 0L;
            this.fileName = "";
            this.checkAutoloadConnection = false;
            this.invalidateCount = 0;
            this.useOriginalExtension = false;
            this.notCopyVideoToGallery = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.videoId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            long j4 = this.audioId;
            if (j4 != 0) {
                iH += y43.h(4, j4);
            }
            long j5 = this.mp4GifId;
            if (j5 != 0) {
                iH += y43.h(5, j5);
            }
            if (!this.url.equals("")) {
                iH += y43.l(6, this.url);
            }
            if (!this.attachId.equals("")) {
                iH += y43.l(7, this.attachId);
            }
            if (this.notifyProgress) {
                iH += y43.a(8);
            }
            long j6 = this.stickerId;
            if (j6 != 0) {
                iH += y43.h(9, j6);
            }
            long j7 = this.fileId;
            if (j7 != 0) {
                iH += y43.h(10, j7);
            }
            if (!this.fileName.equals("")) {
                iH += y43.l(11, this.fileName);
            }
            if (this.checkAutoloadConnection) {
                iH += y43.a(12);
            }
            int i = this.invalidateCount;
            if (i != 0) {
                iH += y43.f(13, i);
            }
            if (this.useOriginalExtension) {
                iH += y43.a(14);
            }
            return this.notCopyVideoToGallery ? iH + y43.a(15) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.videoId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            long j4 = this.audioId;
            if (j4 != 0) {
                y43Var.x(4, j4);
            }
            long j5 = this.mp4GifId;
            if (j5 != 0) {
                y43Var.x(5, j5);
            }
            if (!this.url.equals("")) {
                y43Var.E(6, this.url);
            }
            if (!this.attachId.equals("")) {
                y43Var.E(7, this.attachId);
            }
            boolean z = this.notifyProgress;
            if (z) {
                y43Var.r(8, z);
            }
            long j6 = this.stickerId;
            if (j6 != 0) {
                y43Var.x(9, j6);
            }
            long j7 = this.fileId;
            if (j7 != 0) {
                y43Var.x(10, j7);
            }
            if (!this.fileName.equals("")) {
                y43Var.E(11, this.fileName);
            }
            boolean z2 = this.checkAutoloadConnection;
            if (z2) {
                y43Var.r(12, z2);
            }
            int i = this.invalidateCount;
            if (i != 0) {
                y43Var.w(13, i);
            }
            boolean z3 = this.useOriginalExtension;
            if (z3) {
                y43Var.r(14, z3);
            }
            boolean z4 = this.notCopyVideoToGallery;
            if (z4) {
                y43Var.r(15, z4);
            }
        }

        public static FileDownload parseFrom(x43 x43Var) throws IOException {
            return new FileDownload().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public FileDownload mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                switch (iS) {
                    case 0:
                        return this;
                    case 8:
                        this.requestId = x43Var.q();
                        break;
                    case 16:
                        this.messageId = x43Var.q();
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        this.videoId = x43Var.q();
                        break;
                    case 32:
                        this.audioId = x43Var.q();
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        this.mp4GifId = x43Var.q();
                        break;
                    case 50:
                        this.url = x43Var.r();
                        break;
                    case 58:
                        this.attachId = x43Var.r();
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        this.notifyProgress = x43Var.f();
                        break;
                    case 72:
                        this.stickerId = x43Var.q();
                        break;
                    case 80:
                        this.fileId = x43Var.q();
                        break;
                    case 90:
                        this.fileName = x43Var.r();
                        break;
                    case 96:
                        this.checkAutoloadConnection = x43Var.f();
                        break;
                    case 104:
                        this.invalidateCount = x43Var.p();
                        break;
                    case 112:
                        this.useOriginalExtension = x43Var.f();
                        break;
                    case 120:
                        this.notCopyVideoToGallery = x43Var.f();
                        break;
                    default:
                        if (!x43Var.u(iS)) {
                            return this;
                        }
                        break;
                }
            }
        }
    }

    public static final class FileDownloadCmd extends qw8 {
        private static volatile FileDownloadCmd[] _emptyArray;
        public String attachLocalId;
        public long fileId;
        public String fileName;
        public long messageId;
        public long requestId;

        public FileDownloadCmd() {
            clear();
        }

        public static FileDownloadCmd[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new FileDownloadCmd[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static FileDownloadCmd parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (FileDownloadCmd) qw8.mergeFrom(new FileDownloadCmd(), bArr);
        }

        public FileDownloadCmd clear() {
            this.requestId = 0L;
            this.fileId = 0L;
            this.fileName = "";
            this.messageId = 0L;
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.fileId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            if (!this.fileName.equals("")) {
                iH += y43.l(3, this.fileName);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += y43.h(4, j3);
            }
            return !this.attachLocalId.equals("") ? iH + y43.l(5, this.attachLocalId) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.fileId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            if (!this.fileName.equals("")) {
                y43Var.E(3, this.fileName);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                y43Var.x(4, j3);
            }
            if (this.attachLocalId.equals("")) {
                return;
            }
            y43Var.E(5, this.attachLocalId);
        }

        public static FileDownloadCmd parseFrom(x43 x43Var) throws IOException {
            return new FileDownloadCmd().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public FileDownloadCmd mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.fileId = x43Var.q();
                } else if (iS == 26) {
                    this.fileName = x43Var.r();
                } else if (iS == 32) {
                    this.messageId = x43Var.q();
                } else if (iS == 42) {
                    this.attachLocalId = x43Var.r();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class FileUpload extends qw8 {
        private static volatile FileUpload[] _emptyArray;
        public String attachLocalId;
        public int attachType;
        public long audioId;
        public long chatId;
        public Rect crop;
        public String file;
        public long fileId;
        public String fileName;
        public long lastUpdatedFile;
        public long lastUpdatedOriginalFile;
        public long messageId;
        public String originalFile;
        public boolean profile;
        public long requestId;
        public String url;
        public long videoId;

        public FileUpload() {
            clear();
        }

        public static FileUpload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new FileUpload[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static FileUpload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (FileUpload) qw8.mergeFrom(new FileUpload(), bArr);
        }

        public FileUpload clear() {
            this.requestId = 0L;
            this.file = "";
            this.url = "";
            this.messageId = 0L;
            this.chatId = 0L;
            this.profile = false;
            this.crop = null;
            this.audioId = 0L;
            this.videoId = 0L;
            this.fileId = 0L;
            this.fileName = "";
            this.originalFile = "";
            this.lastUpdatedFile = 0L;
            this.lastUpdatedOriginalFile = 0L;
            this.attachType = 0;
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.file.equals("")) {
                iH += y43.l(2, this.file);
            }
            if (!this.url.equals("")) {
                iH += y43.l(3, this.url);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += y43.h(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                iH += y43.h(5, j3);
            }
            if (this.profile) {
                iH += y43.a(6);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += y43.i(7, rect);
            }
            long j4 = this.audioId;
            if (j4 != 0) {
                iH += y43.h(8, j4);
            }
            long j5 = this.videoId;
            if (j5 != 0) {
                iH += y43.h(9, j5);
            }
            long j6 = this.fileId;
            if (j6 != 0) {
                iH += y43.h(10, j6);
            }
            if (!this.fileName.equals("")) {
                iH += y43.l(11, this.fileName);
            }
            if (!this.originalFile.equals("")) {
                iH += y43.l(12, this.originalFile);
            }
            long j7 = this.lastUpdatedFile;
            if (j7 != 0) {
                iH += y43.h(13, j7);
            }
            long j8 = this.lastUpdatedOriginalFile;
            if (j8 != 0) {
                iH += y43.h(14, j8);
            }
            int i = this.attachType;
            if (i != 0) {
                iH += y43.f(15, i);
            }
            return !this.attachLocalId.equals("") ? iH + y43.l(16, this.attachLocalId) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.file.equals("")) {
                y43Var.E(2, this.file);
            }
            if (!this.url.equals("")) {
                y43Var.E(3, this.url);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                y43Var.x(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                y43Var.x(5, j3);
            }
            boolean z = this.profile;
            if (z) {
                y43Var.r(6, z);
            }
            Rect rect = this.crop;
            if (rect != null) {
                y43Var.y(7, rect);
            }
            long j4 = this.audioId;
            if (j4 != 0) {
                y43Var.x(8, j4);
            }
            long j5 = this.videoId;
            if (j5 != 0) {
                y43Var.x(9, j5);
            }
            long j6 = this.fileId;
            if (j6 != 0) {
                y43Var.x(10, j6);
            }
            if (!this.fileName.equals("")) {
                y43Var.E(11, this.fileName);
            }
            if (!this.originalFile.equals("")) {
                y43Var.E(12, this.originalFile);
            }
            long j7 = this.lastUpdatedFile;
            if (j7 != 0) {
                y43Var.x(13, j7);
            }
            long j8 = this.lastUpdatedOriginalFile;
            if (j8 != 0) {
                y43Var.x(14, j8);
            }
            int i = this.attachType;
            if (i != 0) {
                y43Var.w(15, i);
            }
            if (this.attachLocalId.equals("")) {
                return;
            }
            y43Var.E(16, this.attachLocalId);
        }

        public static FileUpload parseFrom(x43 x43Var) throws IOException {
            return new FileUpload().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public FileUpload mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                switch (iS) {
                    case 0:
                        return this;
                    case 8:
                        this.requestId = x43Var.q();
                        break;
                    case 18:
                        this.file = x43Var.r();
                        break;
                    case 26:
                        this.url = x43Var.r();
                        break;
                    case 32:
                        this.messageId = x43Var.q();
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        this.chatId = x43Var.q();
                        break;
                    case 48:
                        this.profile = x43Var.f();
                        break;
                    case 58:
                        if (this.crop == null) {
                            this.crop = new Rect();
                        }
                        x43Var.j(this.crop);
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        this.audioId = x43Var.q();
                        break;
                    case 72:
                        this.videoId = x43Var.q();
                        break;
                    case 80:
                        this.fileId = x43Var.q();
                        break;
                    case 90:
                        this.fileName = x43Var.r();
                        break;
                    case 98:
                        this.originalFile = x43Var.r();
                        break;
                    case 104:
                        this.lastUpdatedFile = x43Var.q();
                        break;
                    case 112:
                        this.lastUpdatedOriginalFile = x43Var.q();
                        break;
                    case 120:
                        this.attachType = x43Var.p();
                        break;
                    case 130:
                        this.attachLocalId = x43Var.r();
                        break;
                    default:
                        if (!x43Var.u(iS)) {
                            return this;
                        }
                        break;
                }
            }
        }
    }

    public static final class FileUploadCmd extends qw8 {
        private static volatile FileUploadCmd[] _emptyArray;
        public String attachLocalId;
        public String file;
        public String fileName;
        public long messageId;
        public long requestId;

        public FileUploadCmd() {
            clear();
        }

        public static FileUploadCmd[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new FileUploadCmd[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static FileUploadCmd parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (FileUploadCmd) qw8.mergeFrom(new FileUploadCmd(), bArr);
        }

        public FileUploadCmd clear() {
            this.requestId = 0L;
            this.file = "";
            this.messageId = 0L;
            this.fileName = "";
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.file.equals("")) {
                iH += y43.l(2, this.file);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += y43.h(3, j2);
            }
            if (!this.fileName.equals("")) {
                iH += y43.l(4, this.fileName);
            }
            return !this.attachLocalId.equals("") ? iH + y43.l(5, this.attachLocalId) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.file.equals("")) {
                y43Var.E(2, this.file);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                y43Var.x(3, j2);
            }
            if (!this.fileName.equals("")) {
                y43Var.E(4, this.fileName);
            }
            if (this.attachLocalId.equals("")) {
                return;
            }
            y43Var.E(5, this.attachLocalId);
        }

        public static FileUploadCmd parseFrom(x43 x43Var) throws IOException {
            return new FileUploadCmd().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public FileUploadCmd mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 18) {
                    this.file = x43Var.r();
                } else if (iS == 24) {
                    this.messageId = x43Var.q();
                } else if (iS == 34) {
                    this.fileName = x43Var.r();
                } else if (iS == 42) {
                    this.attachLocalId = x43Var.r();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class InvalidateAndDownloadAudio extends qw8 {
        private static volatile InvalidateAndDownloadAudio[] _emptyArray;
        public long chatServerId;
        public FileDownload fileDownload;
        public String outputPath;
        public long requestId;
        public long serverMessageId;

        public InvalidateAndDownloadAudio() {
            clear();
        }

        public static InvalidateAndDownloadAudio[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new InvalidateAndDownloadAudio[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static InvalidateAndDownloadAudio parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (InvalidateAndDownloadAudio) qw8.mergeFrom(new InvalidateAndDownloadAudio(), bArr);
        }

        public InvalidateAndDownloadAudio clear() {
            this.requestId = 0L;
            this.outputPath = "";
            this.chatServerId = 0L;
            this.serverMessageId = 0L;
            this.fileDownload = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.outputPath.equals("")) {
                iH += y43.l(2, this.outputPath);
            }
            long j2 = this.chatServerId;
            if (j2 != 0) {
                iH += y43.h(3, j2);
            }
            long j3 = this.serverMessageId;
            if (j3 != 0) {
                iH += y43.h(4, j3);
            }
            FileDownload fileDownload = this.fileDownload;
            return fileDownload != null ? iH + y43.i(5, fileDownload) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.outputPath.equals("")) {
                y43Var.E(2, this.outputPath);
            }
            long j2 = this.chatServerId;
            if (j2 != 0) {
                y43Var.x(3, j2);
            }
            long j3 = this.serverMessageId;
            if (j3 != 0) {
                y43Var.x(4, j3);
            }
            FileDownload fileDownload = this.fileDownload;
            if (fileDownload != null) {
                y43Var.y(5, fileDownload);
            }
        }

        public static InvalidateAndDownloadAudio parseFrom(x43 x43Var) throws IOException {
            return new InvalidateAndDownloadAudio().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public InvalidateAndDownloadAudio mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 18) {
                    this.outputPath = x43Var.r();
                } else if (iS == 24) {
                    this.chatServerId = x43Var.q();
                } else if (iS == 32) {
                    this.serverMessageId = x43Var.q();
                } else if (iS == 42) {
                    if (this.fileDownload == null) {
                        this.fileDownload = new FileDownload();
                    }
                    x43Var.j(this.fileDownload);
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class LocationRequest extends qw8 {
        private static volatile LocationRequest[] _emptyArray;
        public boolean liveLocation;
        public long messageId;
        public long requestId;

        public LocationRequest() {
            clear();
        }

        public static LocationRequest[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LocationRequest[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static LocationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LocationRequest) qw8.mergeFrom(new LocationRequest(), bArr);
        }

        public LocationRequest clear() {
            this.requestId = 0L;
            this.messageId = 0L;
            this.liveLocation = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            return this.liveLocation ? iH + y43.a(3) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            boolean z = this.liveLocation;
            if (z) {
                y43Var.r(3, z);
            }
        }

        public static LocationRequest parseFrom(x43 x43Var) throws IOException {
            return new LocationRequest().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public LocationRequest mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.messageId = x43Var.q();
                } else if (iS == 24) {
                    this.liveLocation = x43Var.f();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class LocationStop extends qw8 {
        private static volatile LocationStop[] _emptyArray;
        public long chatId;
        public long messageId;
        public long requestId;

        public LocationStop() {
            clear();
        }

        public static LocationStop[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LocationStop[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static LocationStop parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LocationStop) qw8.mergeFrom(new LocationStop(), bArr);
        }

        public LocationStop clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.messageId;
            return j3 != 0 ? iH + y43.h(3, j3) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
        }

        public static LocationStop parseFrom(x43 x43Var) throws IOException {
            return new LocationStop().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public LocationStop mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    this.messageId = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class MsgCancelReaction extends qw8 {
        private static volatile MsgCancelReaction[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long messageId;
        public long messageServerId;
        public long requestId;

        public MsgCancelReaction() {
            clear();
        }

        public static MsgCancelReaction[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgCancelReaction[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgCancelReaction parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgCancelReaction) qw8.mergeFrom(new MsgCancelReaction(), bArr);
        }

        public MsgCancelReaction clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageId = 0L;
            this.chatServerId = 0L;
            this.messageServerId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                iH += y43.h(4, j4);
            }
            long j5 = this.messageServerId;
            return j5 != 0 ? iH + y43.h(5, j5) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                y43Var.x(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                y43Var.x(5, j5);
            }
        }

        public static MsgCancelReaction parseFrom(x43 x43Var) throws IOException {
            return new MsgCancelReaction().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public MsgCancelReaction mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    this.messageId = x43Var.q();
                } else if (iS == 32) {
                    this.chatServerId = x43Var.q();
                } else if (iS == 40) {
                    this.messageServerId = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class MsgDelete extends qw8 {
        private static volatile MsgDelete[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public String complaint;
        public boolean forMe;
        public int itemTypeId;
        public long[] messagesId;
        public long[] messagesServerId;
        public boolean notDeleteMessageFromDb;
        public long requestId;

        public MsgDelete() {
            clear();
        }

        public static MsgDelete[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgDelete[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgDelete parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgDelete) qw8.mergeFrom(new MsgDelete(), bArr);
        }

        public MsgDelete clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            long[] jArr = nd7.d;
            this.messagesId = jArr;
            this.messagesServerId = jArr;
            this.complaint = "";
            this.forMe = false;
            this.itemTypeId = 0;
            this.notDeleteMessageFromDb = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long[] jArr;
            long[] jArr2;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            long[] jArr3 = this.messagesId;
            if (jArr3 != null && jArr3.length > 0) {
                int i2 = 0;
                int iK = 0;
                while (true) {
                    jArr2 = this.messagesId;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    iK += y43.k(jArr2[i2]);
                    i2++;
                }
                iH = iH + iK + jArr2.length;
            }
            long[] jArr4 = this.messagesServerId;
            if (jArr4 != null && jArr4.length > 0) {
                int iK2 = 0;
                while (true) {
                    jArr = this.messagesServerId;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK2 += y43.k(jArr[i]);
                    i++;
                }
                iH = iH + iK2 + jArr.length;
            }
            if (!this.complaint.equals("")) {
                iH += y43.l(6, this.complaint);
            }
            if (this.forMe) {
                iH += y43.a(7);
            }
            int i3 = this.itemTypeId;
            if (i3 != 0) {
                iH += y43.f(8, i3);
            }
            return this.notDeleteMessageFromDb ? iH + y43.a(9) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.chatServerId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            long[] jArr = this.messagesId;
            int i = 0;
            if (jArr != null && jArr.length > 0) {
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.messagesId;
                    if (i2 >= jArr2.length) {
                        break;
                    }
                    y43Var.x(4, jArr2[i2]);
                    i2++;
                }
            }
            long[] jArr3 = this.messagesServerId;
            if (jArr3 != null && jArr3.length > 0) {
                while (true) {
                    long[] jArr4 = this.messagesServerId;
                    if (i >= jArr4.length) {
                        break;
                    }
                    y43Var.x(5, jArr4[i]);
                    i++;
                }
            }
            if (!this.complaint.equals("")) {
                y43Var.E(6, this.complaint);
            }
            boolean z = this.forMe;
            if (z) {
                y43Var.r(7, z);
            }
            int i3 = this.itemTypeId;
            if (i3 != 0) {
                y43Var.w(8, i3);
            }
            boolean z2 = this.notDeleteMessageFromDb;
            if (z2) {
                y43Var.r(9, z2);
            }
        }

        public static MsgDelete parseFrom(x43 x43Var) throws IOException {
            return new MsgDelete().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public MsgDelete mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                switch (iS) {
                    case 0:
                        return this;
                    case 8:
                        this.requestId = x43Var.q();
                        break;
                    case 16:
                        this.chatId = x43Var.q();
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        this.chatServerId = x43Var.q();
                        break;
                    case 32:
                        int iW = nd7.w(x43Var, 32);
                        long[] jArr = this.messagesId;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iW + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = x43Var.q();
                            x43Var.s();
                            length++;
                        }
                        jArr2[length] = x43Var.q();
                        this.messagesId = jArr2;
                        break;
                    case 34:
                        int iE = x43Var.e(x43Var.p());
                        int iC = x43Var.c();
                        int i2 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.q();
                            i2++;
                        }
                        x43Var.t(iC);
                        long[] jArr3 = this.messagesId;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = x43Var.q();
                            length2++;
                        }
                        this.messagesId = jArr4;
                        x43Var.d(iE);
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        int iW2 = nd7.w(x43Var, 40);
                        long[] jArr5 = this.messagesServerId;
                        int length3 = jArr5 == null ? 0 : jArr5.length;
                        int i4 = iW2 + length3;
                        long[] jArr6 = new long[i4];
                        if (length3 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            jArr6[length3] = x43Var.q();
                            x43Var.s();
                            length3++;
                        }
                        jArr6[length3] = x43Var.q();
                        this.messagesServerId = jArr6;
                        break;
                    case 42:
                        int iE2 = x43Var.e(x43Var.p());
                        int iC2 = x43Var.c();
                        int i5 = 0;
                        while (x43Var.b() > 0) {
                            x43Var.q();
                            i5++;
                        }
                        x43Var.t(iC2);
                        long[] jArr7 = this.messagesServerId;
                        int length4 = jArr7 == null ? 0 : jArr7.length;
                        int i6 = i5 + length4;
                        long[] jArr8 = new long[i6];
                        if (length4 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length4);
                        }
                        while (length4 < i6) {
                            jArr8[length4] = x43Var.q();
                            length4++;
                        }
                        this.messagesServerId = jArr8;
                        x43Var.d(iE2);
                        break;
                    case 50:
                        this.complaint = x43Var.r();
                        break;
                    case 56:
                        this.forMe = x43Var.f();
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        this.itemTypeId = x43Var.p();
                        break;
                    case 72:
                        this.notDeleteMessageFromDb = x43Var.f();
                        break;
                    default:
                        if (!x43Var.u(iS)) {
                            return this;
                        }
                        break;
                }
            }
        }
    }

    public static final class MsgDeleteRange extends qw8 {
        private static volatile MsgDeleteRange[] _emptyArray;
        public long chatId;
        public long endTime;
        public int itemTypeId;
        public long requestId;
        public long startTime;

        public MsgDeleteRange() {
            clear();
        }

        public static MsgDeleteRange[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgDeleteRange[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgDeleteRange parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgDeleteRange) qw8.mergeFrom(new MsgDeleteRange(), bArr);
        }

        public MsgDeleteRange clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.startTime = 0L;
            this.endTime = 0L;
            this.itemTypeId = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.startTime;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            long j4 = this.endTime;
            if (j4 != 0) {
                iH += y43.h(4, j4);
            }
            int i = this.itemTypeId;
            return i != 0 ? iH + y43.f(5, i) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.startTime;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            long j4 = this.endTime;
            if (j4 != 0) {
                y43Var.x(4, j4);
            }
            int i = this.itemTypeId;
            if (i != 0) {
                y43Var.w(5, i);
            }
        }

        public static MsgDeleteRange parseFrom(x43 x43Var) throws IOException {
            return new MsgDeleteRange().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public MsgDeleteRange mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    this.startTime = x43Var.q();
                } else if (iS == 32) {
                    this.endTime = x43Var.q();
                } else if (iS == 40) {
                    this.itemTypeId = x43Var.p();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class MsgEdit extends qw8 {
        private static volatile MsgEdit[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public boolean editAttaches;
        public long messageId;
        public long messageServerId;
        public Protos.Attaches oldAttaches;
        public Protos.MessageElements oldElements;
        public int oldStatus;
        public String oldText;
        public long requestId;
        public String text;

        public MsgEdit() {
            clear();
        }

        public static MsgEdit[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgEdit[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgEdit parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgEdit) qw8.mergeFrom(new MsgEdit(), bArr);
        }

        public MsgEdit clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageId = 0L;
            this.chatServerId = 0L;
            this.messageServerId = 0L;
            this.text = "";
            this.oldText = "";
            this.oldStatus = 0;
            this.oldAttaches = null;
            this.editAttaches = false;
            this.oldElements = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                iH += y43.h(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                iH += y43.h(5, j5);
            }
            if (!this.text.equals("")) {
                iH += y43.l(6, this.text);
            }
            if (!this.oldText.equals("")) {
                iH += y43.l(7, this.oldText);
            }
            int i = this.oldStatus;
            if (i != 0) {
                iH += y43.f(8, i);
            }
            Protos.Attaches attaches = this.oldAttaches;
            if (attaches != null) {
                iH += y43.i(9, attaches);
            }
            if (this.editAttaches) {
                iH += y43.a(10);
            }
            Protos.MessageElements messageElements = this.oldElements;
            return messageElements != null ? iH + y43.i(11, messageElements) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                y43Var.x(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                y43Var.x(5, j5);
            }
            if (!this.text.equals("")) {
                y43Var.E(6, this.text);
            }
            if (!this.oldText.equals("")) {
                y43Var.E(7, this.oldText);
            }
            int i = this.oldStatus;
            if (i != 0) {
                y43Var.w(8, i);
            }
            Protos.Attaches attaches = this.oldAttaches;
            if (attaches != null) {
                y43Var.y(9, attaches);
            }
            boolean z = this.editAttaches;
            if (z) {
                y43Var.r(10, z);
            }
            Protos.MessageElements messageElements = this.oldElements;
            if (messageElements != null) {
                y43Var.y(11, messageElements);
            }
        }

        public static MsgEdit parseFrom(x43 x43Var) throws IOException {
            return new MsgEdit().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public MsgEdit mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                switch (iS) {
                    case 0:
                        return this;
                    case 8:
                        this.requestId = x43Var.q();
                        break;
                    case 16:
                        this.chatId = x43Var.q();
                        break;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        this.messageId = x43Var.q();
                        break;
                    case 32:
                        this.chatServerId = x43Var.q();
                        break;
                    case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                        this.messageServerId = x43Var.q();
                        break;
                    case 50:
                        this.text = x43Var.r();
                        break;
                    case 58:
                        this.oldText = x43Var.r();
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        this.oldStatus = x43Var.p();
                        break;
                    case 74:
                        if (this.oldAttaches == null) {
                            this.oldAttaches = new Protos.Attaches();
                        }
                        x43Var.j(this.oldAttaches);
                        break;
                    case 80:
                        this.editAttaches = x43Var.f();
                        break;
                    case 90:
                        if (this.oldElements == null) {
                            this.oldElements = new Protos.MessageElements();
                        }
                        x43Var.j(this.oldElements);
                        break;
                    default:
                        if (!x43Var.u(iS)) {
                            return this;
                        }
                        break;
                }
            }
        }
    }

    public static final class MsgReact extends qw8 {
        private static volatile MsgReact[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long messageId;
        public long messageServerId;
        public String reaction;
        public int reactionType;
        public long requestId;

        public MsgReact() {
            clear();
        }

        public static MsgReact[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgReact[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgReact parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgReact) qw8.mergeFrom(new MsgReact(), bArr);
        }

        public MsgReact clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageId = 0L;
            this.chatServerId = 0L;
            this.messageServerId = 0L;
            this.reaction = "";
            this.reactionType = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                iH += y43.h(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                iH += y43.h(5, j5);
            }
            if (!this.reaction.equals("")) {
                iH += y43.l(6, this.reaction);
            }
            int i = this.reactionType;
            return i != 0 ? iH + y43.f(7, i) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                y43Var.x(4, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                y43Var.x(5, j5);
            }
            if (!this.reaction.equals("")) {
                y43Var.E(6, this.reaction);
            }
            int i = this.reactionType;
            if (i != 0) {
                y43Var.w(7, i);
            }
        }

        public static MsgReact parseFrom(x43 x43Var) throws IOException {
            return new MsgReact().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public MsgReact mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    this.messageId = x43Var.q();
                } else if (iS == 32) {
                    this.chatServerId = x43Var.q();
                } else if (iS == 40) {
                    this.messageServerId = x43Var.q();
                } else if (iS == 50) {
                    this.reaction = x43Var.r();
                } else if (iS == 56) {
                    int iP = x43Var.p();
                    if (iP == 0 || iP == 1) {
                        this.reactionType = iP;
                    }
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class MsgSend extends qw8 {
        private static volatile MsgSend[] _emptyArray;
        public long chatId;
        public long chatServerId;
        public long lastKnownDraftTime;
        public long messageId;
        public boolean notify;
        public long requestId;
        public long userId;

        public MsgSend() {
            clear();
        }

        public static MsgSend[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgSend[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgSend parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgSend) qw8.mergeFrom(new MsgSend(), bArr);
        }

        public MsgSend clear() {
            this.requestId = 0L;
            this.messageId = 0L;
            this.chatId = 0L;
            this.chatServerId = 0L;
            this.userId = 0L;
            this.notify = false;
            this.lastKnownDraftTime = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                iH += y43.h(4, j4);
            }
            long j5 = this.userId;
            if (j5 != 0) {
                iH += y43.h(5, j5);
            }
            if (this.notify) {
                iH += y43.a(6);
            }
            long j6 = this.lastKnownDraftTime;
            return j6 != 0 ? iH + y43.h(8, j6) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                y43Var.x(4, j4);
            }
            long j5 = this.userId;
            if (j5 != 0) {
                y43Var.x(5, j5);
            }
            boolean z = this.notify;
            if (z) {
                y43Var.r(6, z);
            }
            long j6 = this.lastKnownDraftTime;
            if (j6 != 0) {
                y43Var.x(8, j6);
            }
        }

        public static MsgSend parseFrom(x43 x43Var) throws IOException {
            return new MsgSend().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public MsgSend mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.messageId = x43Var.q();
                } else if (iS == 24) {
                    this.chatId = x43Var.q();
                } else if (iS == 32) {
                    this.chatServerId = x43Var.q();
                } else if (iS == 40) {
                    this.userId = x43Var.q();
                } else if (iS == 48) {
                    this.notify = x43Var.f();
                } else if (iS == 64) {
                    this.lastKnownDraftTime = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class MsgSendCallback extends qw8 {
        private static volatile MsgSendCallback[] _emptyArray;
        public ButtonPosition buttonPosition;
        public String buttonType;
        public String callbackId;
        public long messageId;
        public String payload;
        public long requestId;
        public long timestamp;

        public static final class ButtonPosition extends qw8 {
            private static volatile ButtonPosition[] _emptyArray;
            public int column;
            public int row;

            public ButtonPosition() {
                clear();
            }

            public static ButtonPosition[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ButtonPosition[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static ButtonPosition parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ButtonPosition) qw8.mergeFrom(new ButtonPosition(), bArr);
            }

            public ButtonPosition clear() {
                this.row = 0;
                this.column = 0;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                int i = this.row;
                int iF = i != 0 ? y43.f(1, i) : 0;
                int i2 = this.column;
                return i2 != 0 ? iF + y43.f(2, i2) : iF;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                int i = this.row;
                if (i != 0) {
                    y43Var.w(1, i);
                }
                int i2 = this.column;
                if (i2 != 0) {
                    y43Var.w(2, i2);
                }
            }

            public static ButtonPosition parseFrom(x43 x43Var) throws IOException {
                return new ButtonPosition().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public ButtonPosition mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 8) {
                        this.row = x43Var.p();
                    } else if (iS == 16) {
                        this.column = x43Var.p();
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public MsgSendCallback() {
            clear();
        }

        public static MsgSendCallback[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgSendCallback[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgSendCallback parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgSendCallback) qw8.mergeFrom(new MsgSendCallback(), bArr);
        }

        public MsgSendCallback clear() {
            this.requestId = 0L;
            this.callbackId = "";
            this.payload = "";
            this.timestamp = 0L;
            this.messageId = 0L;
            this.buttonPosition = null;
            this.buttonType = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.callbackId.equals("")) {
                iH += y43.l(2, this.callbackId);
            }
            if (!this.payload.equals("")) {
                iH += y43.l(3, this.payload);
            }
            long j2 = this.timestamp;
            if (j2 != 0) {
                iH += y43.h(4, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += y43.h(5, j3);
            }
            ButtonPosition buttonPosition = this.buttonPosition;
            if (buttonPosition != null) {
                iH += y43.i(6, buttonPosition);
            }
            return !this.buttonType.equals("") ? iH + y43.l(7, this.buttonType) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.callbackId.equals("")) {
                y43Var.E(2, this.callbackId);
            }
            if (!this.payload.equals("")) {
                y43Var.E(3, this.payload);
            }
            long j2 = this.timestamp;
            if (j2 != 0) {
                y43Var.x(4, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                y43Var.x(5, j3);
            }
            ButtonPosition buttonPosition = this.buttonPosition;
            if (buttonPosition != null) {
                y43Var.y(6, buttonPosition);
            }
            if (this.buttonType.equals("")) {
                return;
            }
            y43Var.E(7, this.buttonType);
        }

        public static MsgSendCallback parseFrom(x43 x43Var) throws IOException {
            return new MsgSendCallback().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public MsgSendCallback mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 18) {
                    this.callbackId = x43Var.r();
                } else if (iS == 26) {
                    this.payload = x43Var.r();
                } else if (iS == 32) {
                    this.timestamp = x43Var.q();
                } else if (iS == 40) {
                    this.messageId = x43Var.q();
                } else if (iS == 50) {
                    if (this.buttonPosition == null) {
                        this.buttonPosition = new ButtonPosition();
                    }
                    x43Var.j(this.buttonPosition);
                } else if (iS == 58) {
                    this.buttonType = x43Var.r();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class MsgSharePreview extends qw8 {
        private static volatile MsgSharePreview[] _emptyArray;
        public long messageId;
        public long requestId;
        public String text;

        public MsgSharePreview() {
            clear();
        }

        public static MsgSharePreview[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgSharePreview[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgSharePreview parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgSharePreview) qw8.mergeFrom(new MsgSharePreview(), bArr);
        }

        public MsgSharePreview clear() {
            this.requestId = 0L;
            this.text = "";
            this.messageId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.text.equals("")) {
                iH += y43.l(2, this.text);
            }
            long j2 = this.messageId;
            return j2 != 0 ? iH + y43.h(3, j2) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.text.equals("")) {
                y43Var.E(2, this.text);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                y43Var.x(3, j2);
            }
        }

        public static MsgSharePreview parseFrom(x43 x43Var) throws IOException {
            return new MsgSharePreview().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public MsgSharePreview mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 18) {
                    this.text = x43Var.r();
                } else if (iS == 24) {
                    this.messageId = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class MsgView extends qw8 {
        private static volatile MsgView[] _emptyArray;
        public long chatId;
        public long[] messageIds;
        public boolean registerView;
        public long requestId;
        public long time;

        public MsgView() {
            clear();
        }

        public static MsgView[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MsgView[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MsgView parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MsgView) qw8.mergeFrom(new MsgView(), bArr);
        }

        public MsgView clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageIds = nd7.d;
            this.registerView = false;
            this.time = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long[] jArr;
            long j = this.requestId;
            int i = 0;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long[] jArr2 = this.messageIds;
            if (jArr2 != null && jArr2.length > 0) {
                int iK = 0;
                while (true) {
                    jArr = this.messageIds;
                    if (i >= jArr.length) {
                        break;
                    }
                    iK += y43.k(jArr[i]);
                    i++;
                }
                iH = iH + iK + jArr.length;
            }
            if (this.registerView) {
                iH += y43.a(4);
            }
            long j3 = this.time;
            return j3 != 0 ? iH + y43.h(5, j3) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long[] jArr = this.messageIds;
            if (jArr != null && jArr.length > 0) {
                int i = 0;
                while (true) {
                    long[] jArr2 = this.messageIds;
                    if (i >= jArr2.length) {
                        break;
                    }
                    y43Var.x(3, jArr2[i]);
                    i++;
                }
            }
            boolean z = this.registerView;
            if (z) {
                y43Var.r(4, z);
            }
            long j3 = this.time;
            if (j3 != 0) {
                y43Var.x(5, j3);
            }
        }

        public static MsgView parseFrom(x43 x43Var) throws IOException {
            return new MsgView().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public MsgView mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    int iW = nd7.w(x43Var, 24);
                    long[] jArr = this.messageIds;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = iW + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = x43Var.q();
                        x43Var.s();
                        length++;
                    }
                    jArr2[length] = x43Var.q();
                    this.messageIds = jArr2;
                } else if (iS == 26) {
                    int iE = x43Var.e(x43Var.p());
                    int iC = x43Var.c();
                    int i2 = 0;
                    while (x43Var.b() > 0) {
                        x43Var.q();
                        i2++;
                    }
                    x43Var.t(iC);
                    long[] jArr3 = this.messageIds;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = x43Var.q();
                        length2++;
                    }
                    this.messageIds = jArr4;
                    x43Var.d(iE);
                } else if (iS == 32) {
                    this.registerView = x43Var.f();
                } else if (iS == 40) {
                    this.time = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class PhotoUpload extends qw8 {
        private static volatile PhotoUpload[] _emptyArray;
        public String attachLocalId;
        public long chatId;
        public Rect crop;
        public String file;
        public long messageId;
        public boolean profile;
        public long requestId;

        public PhotoUpload() {
            clear();
        }

        public static PhotoUpload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new PhotoUpload[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static PhotoUpload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (PhotoUpload) qw8.mergeFrom(new PhotoUpload(), bArr);
        }

        public PhotoUpload clear() {
            this.requestId = 0L;
            this.file = "";
            this.profile = false;
            this.messageId = 0L;
            this.chatId = 0L;
            this.crop = null;
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.file.equals("")) {
                iH += y43.l(2, this.file);
            }
            if (this.profile) {
                iH += y43.a(3);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += y43.h(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                iH += y43.h(5, j3);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += y43.i(6, rect);
            }
            return !this.attachLocalId.equals("") ? iH + y43.l(7, this.attachLocalId) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.file.equals("")) {
                y43Var.E(2, this.file);
            }
            boolean z = this.profile;
            if (z) {
                y43Var.r(3, z);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                y43Var.x(4, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                y43Var.x(5, j3);
            }
            Rect rect = this.crop;
            if (rect != null) {
                y43Var.y(6, rect);
            }
            if (this.attachLocalId.equals("")) {
                return;
            }
            y43Var.E(7, this.attachLocalId);
        }

        public static PhotoUpload parseFrom(x43 x43Var) throws IOException {
            return new PhotoUpload().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public PhotoUpload mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 18) {
                    this.file = x43Var.r();
                } else if (iS == 24) {
                    this.profile = x43Var.f();
                } else if (iS == 32) {
                    this.messageId = x43Var.q();
                } else if (iS == 40) {
                    this.chatId = x43Var.q();
                } else if (iS == 50) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    x43Var.j(this.crop);
                } else if (iS == 58) {
                    this.attachLocalId = x43Var.r();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class PrepareFileUpload extends qw8 {
        private static volatile PrepareFileUpload[] _emptyArray;
        public String attachLocalId;
        public String fileName;
        public long messageId;
        public long requestId;
        public String uri;

        public PrepareFileUpload() {
            clear();
        }

        public static PrepareFileUpload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new PrepareFileUpload[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static PrepareFileUpload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (PrepareFileUpload) qw8.mergeFrom(new PrepareFileUpload(), bArr);
        }

        public PrepareFileUpload clear() {
            this.requestId = 0L;
            this.uri = "";
            this.messageId = 0L;
            this.fileName = "";
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.uri.equals("")) {
                iH += y43.l(2, this.uri);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += y43.h(3, j2);
            }
            if (!this.fileName.equals("")) {
                iH += y43.l(4, this.fileName);
            }
            return !this.attachLocalId.equals("") ? iH + y43.l(5, this.attachLocalId) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.uri.equals("")) {
                y43Var.E(2, this.uri);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                y43Var.x(3, j2);
            }
            if (!this.fileName.equals("")) {
                y43Var.E(4, this.fileName);
            }
            if (this.attachLocalId.equals("")) {
                return;
            }
            y43Var.E(5, this.attachLocalId);
        }

        public static PrepareFileUpload parseFrom(x43 x43Var) throws IOException {
            return new PrepareFileUpload().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public PrepareFileUpload mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 18) {
                    this.uri = x43Var.r();
                } else if (iS == 24) {
                    this.messageId = x43Var.q();
                } else if (iS == 34) {
                    this.fileName = x43Var.r();
                } else if (iS == 42) {
                    this.attachLocalId = x43Var.r();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class Profile extends qw8 {
        private static volatile Profile[] _emptyArray;
        public String avatarType;
        public Rect crop;
        public String description;
        public String firstName;
        public String lastName;
        public String link;
        public long photoId;
        public String photoToken;
        public long requestId;

        public Profile() {
            clear();
        }

        public static Profile[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Profile[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Profile parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Profile) qw8.mergeFrom(new Profile(), bArr);
        }

        public Profile clear() {
            this.requestId = 0L;
            this.photoToken = "";
            this.crop = null;
            this.description = "";
            this.link = "";
            this.photoId = 0L;
            this.firstName = "";
            this.lastName = "";
            this.avatarType = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.photoToken.equals("")) {
                iH += y43.l(3, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                iH += y43.i(4, rect);
            }
            if (!this.description.equals("")) {
                iH += y43.l(5, this.description);
            }
            if (!this.link.equals("")) {
                iH += y43.l(6, this.link);
            }
            long j2 = this.photoId;
            if (j2 != 0) {
                iH += y43.h(7, j2);
            }
            if (!this.firstName.equals("")) {
                iH += y43.l(8, this.firstName);
            }
            if (!this.lastName.equals("")) {
                iH += y43.l(9, this.lastName);
            }
            return !this.avatarType.equals("") ? iH + y43.l(10, this.avatarType) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.photoToken.equals("")) {
                y43Var.E(3, this.photoToken);
            }
            Rect rect = this.crop;
            if (rect != null) {
                y43Var.y(4, rect);
            }
            if (!this.description.equals("")) {
                y43Var.E(5, this.description);
            }
            if (!this.link.equals("")) {
                y43Var.E(6, this.link);
            }
            long j2 = this.photoId;
            if (j2 != 0) {
                y43Var.x(7, j2);
            }
            if (!this.firstName.equals("")) {
                y43Var.E(8, this.firstName);
            }
            if (!this.lastName.equals("")) {
                y43Var.E(9, this.lastName);
            }
            if (this.avatarType.equals("")) {
                return;
            }
            y43Var.E(10, this.avatarType);
        }

        public static Profile parseFrom(x43 x43Var) throws IOException {
            return new Profile().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public Profile mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 26) {
                    this.photoToken = x43Var.r();
                } else if (iS == 34) {
                    if (this.crop == null) {
                        this.crop = new Rect();
                    }
                    x43Var.j(this.crop);
                } else if (iS == 42) {
                    this.description = x43Var.r();
                } else if (iS == 50) {
                    this.link = x43Var.r();
                } else if (iS == 56) {
                    this.photoId = x43Var.q();
                } else if (iS == 66) {
                    this.firstName = x43Var.r();
                } else if (iS == 74) {
                    this.lastName = x43Var.r();
                } else if (iS == 82) {
                    this.avatarType = x43Var.r();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class Rect extends qw8 {
        private static volatile Rect[] _emptyArray;
        public float bottom;
        public float left;
        public float right;
        public float top;

        public Rect() {
            clear();
        }

        public static Rect[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Rect[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Rect parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Rect) qw8.mergeFrom(new Rect(), bArr);
        }

        public Rect clear() {
            this.left = 0.0f;
            this.top = 0.0f;
            this.right = 0.0f;
            this.bottom = 0.0f;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            int iE = Float.floatToIntBits(this.left) != Float.floatToIntBits(0.0f) ? y43.e(1) : 0;
            if (Float.floatToIntBits(this.top) != Float.floatToIntBits(0.0f)) {
                iE += y43.e(2);
            }
            if (Float.floatToIntBits(this.right) != Float.floatToIntBits(0.0f)) {
                iE += y43.e(3);
            }
            return Float.floatToIntBits(this.bottom) != Float.floatToIntBits(0.0f) ? iE + y43.e(4) : iE;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            if (Float.floatToIntBits(this.left) != Float.floatToIntBits(0.0f)) {
                y43Var.v(1, this.left);
            }
            if (Float.floatToIntBits(this.top) != Float.floatToIntBits(0.0f)) {
                y43Var.v(2, this.top);
            }
            if (Float.floatToIntBits(this.right) != Float.floatToIntBits(0.0f)) {
                y43Var.v(3, this.right);
            }
            if (Float.floatToIntBits(this.bottom) != Float.floatToIntBits(0.0f)) {
                y43Var.v(4, this.bottom);
            }
        }

        public static Rect parseFrom(x43 x43Var) throws IOException {
            return new Rect().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public Rect mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 13) {
                    this.left = x43Var.i();
                } else if (iS == 21) {
                    this.top = x43Var.i();
                } else if (iS == 29) {
                    this.right = x43Var.i();
                } else if (iS == 37) {
                    this.bottom = x43Var.i();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class RemoveContactPhoto extends qw8 {
        private static volatile RemoveContactPhoto[] _emptyArray;
        public long photoId;
        public long requestId;

        public RemoveContactPhoto() {
            clear();
        }

        public static RemoveContactPhoto[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new RemoveContactPhoto[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static RemoveContactPhoto parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (RemoveContactPhoto) qw8.mergeFrom(new RemoveContactPhoto(), bArr);
        }

        public RemoveContactPhoto clear() {
            this.requestId = 0L;
            this.photoId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.photoId;
            return j2 != 0 ? iH + y43.h(2, j2) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.photoId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
        }

        public static RemoveContactPhoto parseFrom(x43 x43Var) throws IOException {
            return new RemoveContactPhoto().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public RemoveContactPhoto mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.photoId = x43Var.q();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class SuspendBot extends qw8 {
        private static volatile SuspendBot[] _emptyArray;
        public long botId;
        public long chatId;
        public long requestId;
        public boolean suspend;

        public SuspendBot() {
            clear();
        }

        public static SuspendBot[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new SuspendBot[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static SuspendBot parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SuspendBot) qw8.mergeFrom(new SuspendBot(), bArr);
        }

        public SuspendBot clear() {
            this.requestId = 0L;
            this.botId = 0L;
            this.chatId = 0L;
            this.suspend = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.botId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            return this.suspend ? iH + y43.a(4) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.botId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.chatId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            boolean z = this.suspend;
            if (z) {
                y43Var.r(4, z);
            }
        }

        public static SuspendBot parseFrom(x43 x43Var) throws IOException {
            return new SuspendBot().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public SuspendBot mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.botId = x43Var.q();
                } else if (iS == 24) {
                    this.chatId = x43Var.q();
                } else if (iS == 32) {
                    this.suspend = x43Var.f();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class SyncChatHistory extends qw8 {
        private static volatile SyncChatHistory[] _emptyArray;
        public long chatId;
        public int count;
        public int itemTypeId;
        public long taskId;

        public SyncChatHistory() {
            clear();
        }

        public static SyncChatHistory[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new SyncChatHistory[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static SyncChatHistory parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SyncChatHistory) qw8.mergeFrom(new SyncChatHistory(), bArr);
        }

        public SyncChatHistory clear() {
            this.taskId = 0L;
            this.chatId = 0L;
            this.count = 0;
            this.itemTypeId = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.taskId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                iH += y43.f(3, i);
            }
            int i2 = this.itemTypeId;
            return i2 != 0 ? iH + y43.f(4, i2) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.taskId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            int i = this.count;
            if (i != 0) {
                y43Var.w(3, i);
            }
            int i2 = this.itemTypeId;
            if (i2 != 0) {
                y43Var.w(4, i2);
            }
        }

        public static SyncChatHistory parseFrom(x43 x43Var) throws IOException {
            return new SyncChatHistory().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public SyncChatHistory mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.taskId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    this.count = x43Var.p();
                } else if (iS == 32) {
                    this.itemTypeId = x43Var.p();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class UpdateFireTimeProtoTask extends qw8 {
        private static volatile UpdateFireTimeProtoTask[] _emptyArray;
        public long chatId;
        public long fireTime;
        public long messageId;
        public boolean notifySender;
        public long requestId;

        public UpdateFireTimeProtoTask() {
            clear();
        }

        public static UpdateFireTimeProtoTask[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new UpdateFireTimeProtoTask[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static UpdateFireTimeProtoTask parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (UpdateFireTimeProtoTask) qw8.mergeFrom(new UpdateFireTimeProtoTask(), bArr);
        }

        public UpdateFireTimeProtoTask clear() {
            this.requestId = 0L;
            this.chatId = 0L;
            this.messageId = 0L;
            this.fireTime = 0L;
            this.notifySender = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.chatId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            long j4 = this.fireTime;
            if (j4 != 0) {
                iH += y43.h(4, j4);
            }
            return this.notifySender ? iH + y43.a(5) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.chatId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            long j4 = this.fireTime;
            if (j4 != 0) {
                y43Var.x(4, j4);
            }
            boolean z = this.notifySender;
            if (z) {
                y43Var.r(5, z);
            }
        }

        public static UpdateFireTimeProtoTask parseFrom(x43 x43Var) throws IOException {
            return new UpdateFireTimeProtoTask().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public UpdateFireTimeProtoTask mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.chatId = x43Var.q();
                } else if (iS == 24) {
                    this.messageId = x43Var.q();
                } else if (iS == 32) {
                    this.fireTime = x43Var.q();
                } else if (iS == 40) {
                    this.notifySender = x43Var.f();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class VideoConvert extends qw8 {
        private static volatile VideoConvert[] _emptyArray;
        public String attachLocalId;
        public String dstPath;
        public float endPosition;
        public long messageId;
        public Quality quality;
        public long requestId;
        public String srcPath;
        public float startPosition;

        public static final class Quality extends qw8 {
            private static volatile Quality[] _emptyArray;
            public int bitrate;
            public int height;
            public boolean isOriginal;
            public int ordinal;
            public int width;

            public Quality() {
                clear();
            }

            public static Quality[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (y37.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Quality[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static Quality parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Quality) qw8.mergeFrom(new Quality(), bArr);
            }

            public Quality clear() {
                this.ordinal = 0;
                this.width = 0;
                this.height = 0;
                this.isOriginal = false;
                this.bitrate = 0;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.qw8
            public int computeSerializedSize() {
                int i = this.ordinal;
                int iF = i != 0 ? y43.f(1, i) : 0;
                int i2 = this.width;
                if (i2 != 0) {
                    iF += y43.f(2, i2);
                }
                int i3 = this.height;
                if (i3 != 0) {
                    iF += y43.f(3, i3);
                }
                if (this.isOriginal) {
                    iF += y43.a(4);
                }
                int i4 = this.bitrate;
                return i4 != 0 ? iF + y43.f(5, i4) : iF;
            }

            @Override // defpackage.qw8
            public void writeTo(y43 y43Var) throws IOException {
                int i = this.ordinal;
                if (i != 0) {
                    y43Var.w(1, i);
                }
                int i2 = this.width;
                if (i2 != 0) {
                    y43Var.w(2, i2);
                }
                int i3 = this.height;
                if (i3 != 0) {
                    y43Var.w(3, i3);
                }
                boolean z = this.isOriginal;
                if (z) {
                    y43Var.r(4, z);
                }
                int i4 = this.bitrate;
                if (i4 != 0) {
                    y43Var.w(5, i4);
                }
            }

            public static Quality parseFrom(x43 x43Var) throws IOException {
                return new Quality().mergeFrom(x43Var);
            }

            @Override // defpackage.qw8
            public Quality mergeFrom(x43 x43Var) throws IOException {
                while (true) {
                    int iS = x43Var.s();
                    if (iS == 0) {
                        return this;
                    }
                    if (iS == 8) {
                        this.ordinal = x43Var.p();
                    } else if (iS == 16) {
                        this.width = x43Var.p();
                    } else if (iS == 24) {
                        this.height = x43Var.p();
                    } else if (iS == 32) {
                        this.isOriginal = x43Var.f();
                    } else if (iS == 40) {
                        this.bitrate = x43Var.p();
                    } else if (!x43Var.u(iS)) {
                        return this;
                    }
                }
            }
        }

        public VideoConvert() {
            clear();
        }

        public static VideoConvert[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new VideoConvert[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static VideoConvert parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (VideoConvert) qw8.mergeFrom(new VideoConvert(), bArr);
        }

        public VideoConvert clear() {
            this.requestId = 0L;
            this.srcPath = "";
            this.dstPath = "";
            this.quality = null;
            this.messageId = 0L;
            this.attachLocalId = "";
            this.startPosition = 0.0f;
            this.endPosition = 0.0f;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.srcPath.equals("")) {
                iH += y43.l(2, this.srcPath);
            }
            if (!this.dstPath.equals("")) {
                iH += y43.l(3, this.dstPath);
            }
            Quality quality = this.quality;
            if (quality != null) {
                iH += y43.i(4, quality);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += y43.h(5, j2);
            }
            if (!this.attachLocalId.equals("")) {
                iH += y43.l(6, this.attachLocalId);
            }
            if (Float.floatToIntBits(this.startPosition) != Float.floatToIntBits(0.0f)) {
                iH += y43.e(7);
            }
            return Float.floatToIntBits(this.endPosition) != Float.floatToIntBits(0.0f) ? iH + y43.e(8) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.srcPath.equals("")) {
                y43Var.E(2, this.srcPath);
            }
            if (!this.dstPath.equals("")) {
                y43Var.E(3, this.dstPath);
            }
            Quality quality = this.quality;
            if (quality != null) {
                y43Var.y(4, quality);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                y43Var.x(5, j2);
            }
            if (!this.attachLocalId.equals("")) {
                y43Var.E(6, this.attachLocalId);
            }
            if (Float.floatToIntBits(this.startPosition) != Float.floatToIntBits(0.0f)) {
                y43Var.v(7, this.startPosition);
            }
            if (Float.floatToIntBits(this.endPosition) != Float.floatToIntBits(0.0f)) {
                y43Var.v(8, this.endPosition);
            }
        }

        public static VideoConvert parseFrom(x43 x43Var) throws IOException {
            return new VideoConvert().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public VideoConvert mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 18) {
                    this.srcPath = x43Var.r();
                } else if (iS == 26) {
                    this.dstPath = x43Var.r();
                } else if (iS == 34) {
                    if (this.quality == null) {
                        this.quality = new Quality();
                    }
                    x43Var.j(this.quality);
                } else if (iS == 40) {
                    this.messageId = x43Var.q();
                } else if (iS == 50) {
                    this.attachLocalId = x43Var.r();
                } else if (iS == 61) {
                    this.startPosition = x43Var.i();
                } else if (iS == 69) {
                    this.endPosition = x43Var.i();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class VideoPlay extends qw8 {
        private static volatile VideoPlay[] _emptyArray;
        public String attachLocalId;
        public long chatServerId;
        public long messageId;
        public long messageServerId;
        public long requestId;
        public boolean saveToGallery;
        public boolean startDownload;
        public String token;
        public long videoId;

        public VideoPlay() {
            clear();
        }

        public static VideoPlay[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new VideoPlay[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static VideoPlay parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (VideoPlay) qw8.mergeFrom(new VideoPlay(), bArr);
        }

        public VideoPlay clear() {
            this.requestId = 0L;
            this.videoId = 0L;
            this.messageId = 0L;
            this.attachLocalId = "";
            this.startDownload = false;
            this.chatServerId = 0L;
            this.messageServerId = 0L;
            this.token = "";
            this.saveToGallery = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            long j2 = this.videoId;
            if (j2 != 0) {
                iH += y43.h(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                iH += y43.h(3, j3);
            }
            if (!this.attachLocalId.equals("")) {
                iH += y43.l(4, this.attachLocalId);
            }
            if (this.startDownload) {
                iH += y43.a(5);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                iH += y43.h(6, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                iH += y43.h(7, j5);
            }
            if (!this.token.equals("")) {
                iH += y43.l(8, this.token);
            }
            return this.saveToGallery ? iH + y43.a(9) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            long j2 = this.videoId;
            if (j2 != 0) {
                y43Var.x(2, j2);
            }
            long j3 = this.messageId;
            if (j3 != 0) {
                y43Var.x(3, j3);
            }
            if (!this.attachLocalId.equals("")) {
                y43Var.E(4, this.attachLocalId);
            }
            boolean z = this.startDownload;
            if (z) {
                y43Var.r(5, z);
            }
            long j4 = this.chatServerId;
            if (j4 != 0) {
                y43Var.x(6, j4);
            }
            long j5 = this.messageServerId;
            if (j5 != 0) {
                y43Var.x(7, j5);
            }
            if (!this.token.equals("")) {
                y43Var.E(8, this.token);
            }
            boolean z2 = this.saveToGallery;
            if (z2) {
                y43Var.r(9, z2);
            }
        }

        public static VideoPlay parseFrom(x43 x43Var) throws IOException {
            return new VideoPlay().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public VideoPlay mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 16) {
                    this.videoId = x43Var.q();
                } else if (iS == 24) {
                    this.messageId = x43Var.q();
                } else if (iS == 34) {
                    this.attachLocalId = x43Var.r();
                } else if (iS == 40) {
                    this.startDownload = x43Var.f();
                } else if (iS == 48) {
                    this.chatServerId = x43Var.q();
                } else if (iS == 56) {
                    this.messageServerId = x43Var.q();
                } else if (iS == 66) {
                    this.token = x43Var.r();
                } else if (iS == 72) {
                    this.saveToGallery = x43Var.f();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }

    public static final class VideoUpload extends qw8 {
        private static volatile VideoUpload[] _emptyArray;
        public String attachLocalId;
        public boolean audio;
        public String file;
        public long messageId;
        public long requestId;

        public VideoUpload() {
            clear();
        }

        public static VideoUpload[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (y37.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new VideoUpload[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static VideoUpload parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (VideoUpload) qw8.mergeFrom(new VideoUpload(), bArr);
        }

        public VideoUpload clear() {
            this.requestId = 0L;
            this.file = "";
            this.audio = false;
            this.messageId = 0L;
            this.attachLocalId = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.qw8
        public int computeSerializedSize() {
            long j = this.requestId;
            int iH = j != 0 ? y43.h(1, j) : 0;
            if (!this.file.equals("")) {
                iH += y43.l(2, this.file);
            }
            if (this.audio) {
                iH += y43.a(3);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                iH += y43.h(4, j2);
            }
            return !this.attachLocalId.equals("") ? iH + y43.l(5, this.attachLocalId) : iH;
        }

        @Override // defpackage.qw8
        public void writeTo(y43 y43Var) throws IOException {
            long j = this.requestId;
            if (j != 0) {
                y43Var.x(1, j);
            }
            if (!this.file.equals("")) {
                y43Var.E(2, this.file);
            }
            boolean z = this.audio;
            if (z) {
                y43Var.r(3, z);
            }
            long j2 = this.messageId;
            if (j2 != 0) {
                y43Var.x(4, j2);
            }
            if (this.attachLocalId.equals("")) {
                return;
            }
            y43Var.E(5, this.attachLocalId);
        }

        public static VideoUpload parseFrom(x43 x43Var) throws IOException {
            return new VideoUpload().mergeFrom(x43Var);
        }

        @Override // defpackage.qw8
        public VideoUpload mergeFrom(x43 x43Var) throws IOException {
            while (true) {
                int iS = x43Var.s();
                if (iS == 0) {
                    return this;
                }
                if (iS == 8) {
                    this.requestId = x43Var.q();
                } else if (iS == 18) {
                    this.file = x43Var.r();
                } else if (iS == 24) {
                    this.audio = x43Var.f();
                } else if (iS == 32) {
                    this.messageId = x43Var.q();
                } else if (iS == 42) {
                    this.attachLocalId = x43Var.r();
                } else if (!x43Var.u(iS)) {
                    return this;
                }
            }
        }
    }
}
