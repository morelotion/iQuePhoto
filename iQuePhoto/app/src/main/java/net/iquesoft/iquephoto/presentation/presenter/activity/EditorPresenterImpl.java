package net.iquesoft.iquephoto.presentation.presenter.activity;

import android.graphics.Bitmap;
import android.support.annotation.Nullable;

import net.iquesoft.iquephoto.presentation.presenter.activity.interfaces.EditorPresenter;
import net.iquesoft.iquephoto.presentation.view.activity.EditorView;

import javax.inject.Inject;

public class EditorPresenterImpl implements EditorPresenter {

    private EditorView mView;

    @Inject
    public EditorPresenterImpl(EditorView view) {
        mView = view;
    }

    @Override
    public void onBackPressed(Bitmap bitmap, @Nullable Bitmap alteredBitmap) {
        if (alteredBitmap != null) {
            if (!bitmap.sameAs(alteredBitmap))
                mView.showAlertDialog();
            else mView.navigateBack(false);
        } else {
            mView.navigateBack(false);
        }
    }
}
