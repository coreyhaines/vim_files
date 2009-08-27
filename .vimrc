syntax on
filetype plugin indent on
colorscheme vividchalk

runtime! autoload/pathogen.vim
if exists("g:loaded_pathogen")
  call pathogen#runtime_append_all_bundles()
end

if (has('gui_running'))
  set guifont=Monaco:h16
  set guioptions-=T
  set columns=120
  set lines=70
  set number
endif
