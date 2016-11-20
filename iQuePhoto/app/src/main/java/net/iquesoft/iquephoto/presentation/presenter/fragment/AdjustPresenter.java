package net.iquesoft.iquephoto.presentation.presenter.fragment;

import net.iquesoft.iquephoto.common.BaseFragmentPresenter;
import net.iquesoft.iquephoto.core.EditorCommand;
import net.iquesoft.iquephoto.presentation.view.fragment.AdjustView;

public interface AdjustPresenter extends BaseFragmentPresenter<AdjustView> {
    void setupAdjust(EditorCommand editorCommand);
}
